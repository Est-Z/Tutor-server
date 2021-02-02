package com.gyl.tutor.dao;

import com.gyl.tutor.pojo.TeaSubject;
import com.gyl.tutor.pojo.TeaTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeaSubjectDao extends JpaRepository<TeaSubject,Long> {
    public List<TeaSubject> findByTeaId(Long id);
}
