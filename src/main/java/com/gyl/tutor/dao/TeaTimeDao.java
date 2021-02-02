package com.gyl.tutor.dao;

import com.gyl.tutor.pojo.TeaTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaTimeDao extends  JpaRepository<TeaTime,Long> {
}
