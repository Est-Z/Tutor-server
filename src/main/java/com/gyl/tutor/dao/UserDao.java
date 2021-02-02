package com.gyl.tutor.dao;

import com.gyl.tutor.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserDao extends JpaRepository<User,Long> {
    public User getUserNumByOpenid(@Param("openid") String openid);
}
