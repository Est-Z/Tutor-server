package com.gyl.tutor.dao;

import com.gyl.tutor.pojo.InfoTea;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoTeaDao extends JpaRepository<InfoTea,Long> {

    public InfoTea getUserByOpenid(@Param("openid") String openid);
}
