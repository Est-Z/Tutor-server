package com.gyl.tutor.controller;


import com.gyl.tutor.pojo.*;
import com.gyl.tutor.service.InfoStuService;
import com.gyl.tutor.service.StuSubjectService;
import com.gyl.tutor.service.StuTimeService;
import com.gyl.tutor.service.UserService;
import com.gyl.tutor.utils.StuInfoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/stuInfo")
public class InfoStuController {
    @Autowired
    InfoStuService infoStuService;

    @Autowired
    StuSubjectService stuSubjectService;

    @Autowired
    StuTimeService stuTimeService;

    @Autowired
    UserService userService;

    @GetMapping("/show")
    public void insertStuInfo(String openid,String nameWx,String sex,String grade,String[] subject,String hopeTeaSex,String hopeTeaExp,String province,String city,String area,String[] time){

        Map<String,String> data = new HashMap<>();
        data.put("openid",openid);
        data.put("nameWx",nameWx);
        data.put("sex",sex);
        data.put("grade",grade);
        data.put("hopeTeaSex",hopeTeaSex);
        data.put("hopeTeaExp",hopeTeaExp);
        data.put("province",province);
        data.put("city",city);
        data.put("area",area);

        System.out.println(data);

        for(String s : subject){
            System.out.println(s);
        }
        for (String t : time){
            System.out.println(t);
        }

    }

    @PostMapping("/add")
    public CustomResult add(@RequestBody StuInfoUtils stuInfoUtils){

        InfoStu infoStu = new InfoStu();
        List<StuSubject> stuSubjects = new ArrayList<StuSubject>();
        List<StuTime> stuTimes = new ArrayList<StuTime>();
        User user = new User();

        long nextId = infoStuService.getID();

        infoStu.setId(nextId);
        infoStu.setOpenid(stuInfoUtils.getOpenid());
        infoStu.setNameWx(stuInfoUtils.getNameWx());
        infoStu.setSex(stuInfoUtils.getSex());
        infoStu.setGrade(stuInfoUtils.getGrade());
        infoStu.setHopeTeaSex(stuInfoUtils.getHopeTeaSex());
        infoStu.setHopeTeaExp(stuInfoUtils.getHopeTeaExp());
        infoStu.setProvince(stuInfoUtils.getAddress()[0]);
        infoStu.setCity(stuInfoUtils.getAddress()[1]);
        infoStu.setArea(stuInfoUtils.getAddress()[2]);

        infoStuService.updateInfoStu(infoStu);

        //User update
        user.setUser("student");
        user.setOpenid(stuInfoUtils.getOpenid());
        userService.updateUser(user);


        long id = infoStuService.getUserByOpenid(stuInfoUtils.getOpenid()).getId();

        String[] subjects = stuInfoUtils.getSubject();
        for(String subject : subjects){
            StuSubject tmp = new StuSubject();
            tmp.setStuId(id);
            tmp.setSubject(subject);
            stuSubjects.add(tmp);
        }

        String[] times = stuInfoUtils.getTime();
        for(String time : times) {

            StuTime tmp = new StuTime();
            tmp.setStuId(id);
            tmp.setTime(time);
            stuTimes.add(tmp);
        }



        for (StuSubject stuSubject : stuSubjects){
            stuSubjectService.updateStuSubject(stuSubject);
        }

        for (StuTime stuTime : stuTimes){
            stuTimeService.updateStuTime(stuTime);
        }

        return new CustomResult("ok");
    }


}
