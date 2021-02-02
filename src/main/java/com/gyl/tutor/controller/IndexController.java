package com.gyl.tutor.controller;

import com.gyl.tutor.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

//    @Autowired
//    UserDao userDao;
//
//    public IndexController(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @RequestMapping("/login")
//    public String index(String userName,String email){
//
//        int count = userDao.getUserByloginName(userName,email);
//        if(count>0){
//            return "ok";
//        }else{
//            return "no";
//        }
//    }
}
