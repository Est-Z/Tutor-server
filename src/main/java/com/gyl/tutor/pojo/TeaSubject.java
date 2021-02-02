package com.gyl.tutor.pojo;

import javax.persistence.*;

@Entity
@Table(name = "teasubject")
public class TeaSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "tea_id")
    long teaId;

    @Column(name = "subject")
    String subject;

    public TeaSubject(long id, long teaId, String subject) {
        this.id = id;
        this.teaId = teaId;
        this.subject = subject;
    }

    public TeaSubject() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTesId() {
        return teaId;
    }

    public void setTeaId(long teaId) {
        this.teaId = teaId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
