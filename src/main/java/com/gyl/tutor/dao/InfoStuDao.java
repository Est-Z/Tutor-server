package com.gyl.tutor.dao;

import com.gyl.tutor.pojo.InfoStu;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoStuDao extends JpaRepository<InfoStu,Long> {

    public InfoStu getUserByOpenid(@Param("openid") String openid);
}
