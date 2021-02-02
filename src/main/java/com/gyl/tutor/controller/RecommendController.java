package com.gyl.tutor.controller;


import com.gyl.tutor.middle.TeacherResult;
import com.gyl.tutor.pojo.*;
import com.gyl.tutor.service.InfoStuService;
import com.gyl.tutor.service.InfoTeaService;
import com.gyl.tutor.service.TeaSubjectService;
import com.gyl.tutor.service.TeaTimeService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/recommend")
public class RecommendController {

    @Autowired
    InfoStuService infoStuService;

    @Autowired
    InfoTeaService infoTeaService;

    @Autowired
    TeaTimeService teaTimeService;

    @Autowired
    TeaSubjectService teaSubjectService;

    @GetMapping("/auto")
    public List<TeacherResult> getRecommendAuto(String openid){

        List<RecommendResult> recommendResults = new ArrayList<RecommendResult>();

        String hopeSex = "";
        String hopeExp = "";
        String grade = "";

        //获取学生用户信息
        InfoStu infoStu  = infoStuService.getUserByOpenid(openid);


        //查询满足硬性条件教师用户
        List<InfoTea> teachers = infoTeaService.findByCondition(infoStu.getHopeTeaSex(),infoStu.getHopeTeaExp(),infoStu.getGrade());
        List<TeacherResult> teacherResults = new ArrayList<TeacherResult>();
        //转为信息返回格式
        for(InfoTea teacher : teachers){
            TeacherResult teacherResult = new TeacherResult();
            teacherResult.setNameWx(teacher.getNameWx());
            teacherResult.setName(teacher.getName());
            teacherResult.setSex(teacher.getSex());
            teacherResult.setGrade(teacher.getTeaGrade());
            teacherResult.setStatus(teacher.getStatus());
            teacherResult.setSchool(teacher.getSchool());
            teacherResult.setMobile(teacher.getMobile());
            teacherResult.setBrief(teacher.getBrief());

            List<TeaTime> teaTimes = teaTimeService.findByTeaId(teacher.getId());
            for(TeaTime teaTime : teaTimes){
                teacherResult.addTime(teaTime.getTime());
            }

            List<TeaSubject> teaSubjects = teaSubjectService.findByTeaId(teacher.getId());
            for(TeaSubject teaSubject : teaSubjects){
                teacherResult.addSubject(teaSubject.getSubject());
            }

            teacherResult.addAddress(teacher.getProvince());
            teacherResult.addAddress(teacher.getCity());
            teacherResult.addAddress(teacher.getArea());

            teacherResults.add(teacherResult);
        }



        JSONArray result = new JSONArray();
        for(TeacherResult t : teacherResults){
            result.put(t);
//            System.out.println(t.toString());
        }
//        System.out.println("---------");
//        System.out.println(result.toString());

        return teacherResults;
    }


}
