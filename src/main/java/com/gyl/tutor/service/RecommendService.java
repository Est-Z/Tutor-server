package com.gyl.tutor.service;


import com.gyl.tutor.dao.InfoTeaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendService {

    @Autowired
    InfoTeaDao infoTeaDao;

}
