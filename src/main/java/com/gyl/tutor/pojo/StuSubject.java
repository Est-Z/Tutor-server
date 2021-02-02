package com.gyl.tutor.pojo;

import javax.persistence.*;

@Entity
@Table(name = "stusubject")
public class StuSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "stu_id")
    long stuId;

    @Column(name = "subject")
    String subject;

    public StuSubject(long id, long stuId, String subject) {
        this.id = id;
        this.stuId = stuId;
        this.subject = subject;
    }

    public StuSubject() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
