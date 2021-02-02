package com.gyl.tutor.pojo;

import javax.persistence.*;


@Entity
@Table(name = "stutime")
public class StuTime {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;


    @Column(name = "stu_id")
    long stuId;

    @Column(name = "time")
    String time;

    public StuTime(long id, long stuId, String time) {
        this.id = id;
        this.stuId = stuId;
        this.time = time;
    }

    public StuTime() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
