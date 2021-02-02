package com.gyl.tutor.service;

import com.gyl.tutor.dao.StuSubjectDao;
import com.gyl.tutor.pojo.InfoStu;
import com.gyl.tutor.pojo.StuSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuSubjectService {

    @Autowired
    StuSubjectDao stuSubjectDao;

    public void updateStuSubject(StuSubject stuSubject){
        stuSubjectDao.save(stuSubject);
    }

}
