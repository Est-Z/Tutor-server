package com.gyl.tutor.service;

import com.gyl.tutor.dao.UserDao;
import com.gyl.tutor.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void updateUser(User user){
        userDao.save(user);
    }

    public int getUserNumByOpenid(String openid){
        return userDao.getUserNumByOpenid(openid) == null ? 0 : 1;
    }
}
