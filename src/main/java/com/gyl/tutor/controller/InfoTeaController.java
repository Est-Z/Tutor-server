package com.gyl.tutor.controller;

import com.gyl.tutor.pojo.*;
import com.gyl.tutor.service.InfoTeaService;
import com.gyl.tutor.service.TeaSubjectService;
import com.gyl.tutor.service.TeaTimeService;
import com.gyl.tutor.service.UserService;
import com.gyl.tutor.utils.TeaInfoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/teaInfo")
public class InfoTeaController {

    @Autowired
    InfoTeaService infoTeaService;

    @Autowired
    TeaSubjectService teaSubjectService;

    @Autowired
    TeaTimeService teaTimeService;

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public CustomResult add(@RequestBody TeaInfoUtils teaInfoUtils){

        System.out.println(teaInfoUtils.toString());



        InfoTea infoTea = new InfoTea();
        List<TeaSubject> teaSubjects = new ArrayList<TeaSubject>();
        List<TeaTime> teaTimes = new ArrayList<TeaTime>();
        User user = new User();

        long nextId = infoTeaService.getID();

        infoTea.setId(nextId);
        infoTea.setOpenid(teaInfoUtils.getOpenid());
        infoTea.setNameWx(teaInfoUtils.getNameWx());
        infoTea.setName(teaInfoUtils.getName());
        infoTea.setSex(teaInfoUtils.getSex());
        infoTea.setTeaGrade(teaInfoUtils.getGrade());
        infoTea.setCard(teaInfoUtils.getCard());
        infoTea.setStatus(teaInfoUtils.getStatus());
        infoTea.setSchool(teaInfoUtils.getSchool());
        infoTea.setProvince(teaInfoUtils.getAddress()[0]);
        infoTea.setCity(teaInfoUtils.getAddress()[1]);
        infoTea.setArea(teaInfoUtils.getAddress()[2]);
        infoTea.setMobile(teaInfoUtils.getMobile());
        infoTea.setBrief(teaInfoUtils.getBrief());
        infoTea.setIsExp("否");
        infoTeaService.updateInfoStu(infoTea);

        //User update
        user.setUser("teacher");
        user.setOpenid(teaInfoUtils.getOpenid());
        userService.updateUser(user);

        long id = infoTeaService.getUserByOpenid(teaInfoUtils.getOpenid()).getId();

        String[] subjects = teaInfoUtils.getSubject();
        for(String subject : subjects){
            TeaSubject tmp = new TeaSubject();
            tmp.setTeaId(id);
            tmp.setSubject(subject);
            teaSubjects.add(tmp);
        }

        String[] times = teaInfoUtils.getTime();
        for(String time : times) {

            TeaTime tmp = new TeaTime();
            tmp.setTeaId(id);
            tmp.setTime(time);
            teaTimes.add(tmp);
        }



        for (TeaSubject teaSubject : teaSubjects){
            teaSubjectService.updateTeaSubject(teaSubject);
        }

        for (TeaTime teaTime : teaTimes){
            teaTimeService.updateTeaTime(teaTime);
        }


        return new CustomResult("ok");
    }

}
