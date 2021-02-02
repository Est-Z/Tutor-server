package com.gyl.tutor.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "infostu")
//@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class InfoStu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "openid")
    String openid;

    @Column(name = "name_wx")
    String nameWx;

    @Column(name = "sex")
    String sex;

    @Column(name = "grade")
    String grade;

    @Column(name = "hope_tea_sex")
    String hopeTeaSex;

    @Column(name = "hope_tea_exp")
    String hopeTeaExp;

    @Column(name = "province")
    String province;

    @Column(name = "city")
    String city;

    @Column(name = "area")
    String area;

    public InfoStu(long id, String openid, String nameWx, String sex, String grade, String hopeTeaSex, String hopeTeaExp, String province, String city, String area) {
        this.id = id;
        this.openid = openid;
        this.nameWx = nameWx;
        this.sex = sex;
        this.grade = grade;
        this.hopeTeaSex = hopeTeaSex;
        this.hopeTeaExp = hopeTeaExp;
        this.province = province;
        this.city = city;
        this.area = area;
    }

    public InfoStu() {
    }

    public long getId() {
        return id;
    }

    public String getOpenid() {
        return openid;
    }

    public String getNameWx() {
        return nameWx;
    }

    public String getSex() {
        return sex;
    }

    public String getGrade() {
        return grade;
    }

    public String getHopeTeaSex() {
        return hopeTeaSex;
    }

    public String getHopeTeaExp() {
        return hopeTeaExp;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setNameWx(String nameWx) {
        this.nameWx = nameWx;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setHopeTeaSex(String hopeTeaSex) {
        this.hopeTeaSex = hopeTeaSex;
    }

    public void setHopeTeaExp(String hopeTeaExp) {
        this.hopeTeaExp = hopeTeaExp;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "InfoStu{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", nameWx='" + nameWx + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", hopeTeaSex='" + hopeTeaSex + '\'' +
                ", hopeTeaExp='" + hopeTeaExp + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
