package com.gyl.tutor.dao;

import com.gyl.tutor.pojo.TeaTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeaTimeDao extends  JpaRepository<TeaTime,Long> {

    public List<TeaTime> findByTeaId(Long id);
}
