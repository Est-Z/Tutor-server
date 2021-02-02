package com.gyl.tutor.service;

import com.gyl.tutor.dao.InfoTeaDao;
import com.gyl.tutor.pojo.InfoStu;
import com.gyl.tutor.pojo.InfoTea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoTeaService {

    @Autowired
    InfoTeaDao infoTeaDao;


    public int getID(){
        int len = infoTeaDao.findAll().size();
        return len+1;
    }

    public void updateInfoStu(InfoTea infoTea){
        infoTeaDao.save(infoTea);
    }

    public InfoTea getUserByOpenid(String openid){
        return infoTeaDao.getUserByOpenid(openid);
    }

    public List<InfoTea> findByCondition(String hopeSex, String hopeExp, String grade){

        InfoTea infoTea = new InfoTea();
        if(hopeSex=="均可"){
            infoTea.setSex(null);
        }else{
            infoTea.setSex(hopeSex);
        }
        if(hopeExp=="均可"){
            infoTea.setIsExp(null);
        }else{
            infoTea.setIsExp(hopeExp);
        }





        List<InfoTea> teachers = new ArrayList<InfoTea>();

        return teachers;
    }
}
