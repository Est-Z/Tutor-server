package com.gyl.tutor.controller;


import com.gyl.tutor.pojo.CustomResult;
import com.gyl.tutor.pojo.InfoStu;
import com.gyl.tutor.pojo.InfoTea;
import com.gyl.tutor.pojo.RecommendResult;
import com.gyl.tutor.service.InfoStuService;
import com.gyl.tutor.service.InfoTeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/recommend")
public class recommendController {

    @Autowired
    InfoStuService infoStuService;

    @Autowired
    InfoTeaService infoTeaService;

    @GetMapping("/auto")
    public List<RecommendResult> getRecommendAuto(String openid){

        List<RecommendResult> recommendResults = new ArrayList<RecommendResult>();

        String hopeSex = "";
        String hopeExp = "";
        String grade = "";

        //获取学生用户信息
        InfoStu infoStu  = infoStuService.getUserByOpenid(openid);

        //查询满足硬性条件教师用户
        List<InfoTea> teachers = infoTeaService.findByCondition(infoStu.getHopeTeaSex(),infoStu.getHopeTeaExp(),infoStu.getGrade());



        System.out.println(infoStu.toString());
        return recommendResults;
    }


}
