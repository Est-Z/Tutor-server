package com.gyl.tutor.service;

import com.gyl.tutor.dao.StuTimeDao;
import com.gyl.tutor.pojo.InfoStu;
import com.gyl.tutor.pojo.StuTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuTimeService {

    @Autowired
    StuTimeDao stuTimeDao;

    public void updateStuTime(StuTime stuTime){
        stuTimeDao.save(stuTime);
    }


}
