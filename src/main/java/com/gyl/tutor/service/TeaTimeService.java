package com.gyl.tutor.service;

import com.gyl.tutor.dao.TeaTimeDao;
import com.gyl.tutor.pojo.TeaTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeaTimeService {

    @Autowired
    TeaTimeDao teaTimeDao;

    public void updateTeaTime(TeaTime teaTime){
        teaTimeDao.save(teaTime);
    }
}
