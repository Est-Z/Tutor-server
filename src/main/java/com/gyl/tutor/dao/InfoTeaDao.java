package com.gyl.tutor.dao;

import com.gyl.tutor.pojo.InfoTea;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InfoTeaDao extends JpaRepository<InfoTea,Long> {

    public InfoTea getUserByOpenid(@Param("openid") String openid);

//    public List<InfoTea> findByRequired(InfoTea infotea);
    public List<InfoTea> findByTeaGrade(String grade);
    public List<InfoTea> findBySexAndTeaGrade(String sex,String grade);
    public List<InfoTea> findByIsExpAndTeaGrade(String IsExp,String grade);
    public List<InfoTea> findBySexAndIsExpAndTeaGrade(String sex,String IsExp,String grade);
}
