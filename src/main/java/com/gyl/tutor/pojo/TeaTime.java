package com.gyl.tutor.pojo;

import javax.persistence.*;


@Entity
@Table(name = "teatime")
public class TeaTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;


    @Column(name = "tea_id")
    long teaId;

    @Column(name = "time")
    String time;

    public TeaTime(long id, long teaId, String time) {
        this.id = id;
        this.teaId = teaId;
        this.time = time;
    }

    public TeaTime() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTeaId() {
        return teaId;
    }

    public void setTeaId(long teaId) {
        this.teaId = teaId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
