package com.gyl.tutor.service;

import com.gyl.tutor.dao.TeaSubjectDao;
import com.gyl.tutor.pojo.TeaSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeaSubjectService {

    @Autowired
    TeaSubjectDao teaSubjectDao;

    public void updateTeaSubject(TeaSubject teaSubject){
        teaSubjectDao.save(teaSubject);
    }

}
