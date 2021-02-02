package com.gyl.tutor.service;

import com.gyl.tutor.dao.InfoStuDao;
import com.gyl.tutor.pojo.InfoStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoStuService {
    @Autowired
    InfoStuDao infoStuDao;

    public List<InfoStu> getAll(){
        List<InfoStu> infoStuList = infoStuDao.findAll();
        return infoStuList;
    }

    public void updateInfoStu(InfoStu infoStu){
        infoStuDao.save(infoStu);
    }

    public int getID(){
        int len = infoStuDao.findAll().size();
        return len+1;
    }

    public InfoStu getUserByOpenid(String openid){
        return infoStuDao.getUserByOpenid(openid);
    }


}
