package com.gyl.tutor.pojo;

import javax.persistence.*;

@Entity
@Table(name = "infotea")
public class InfoTea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "openid")
    String openid;

    @Column(name = "name_wx")
    String nameWx;

    @Column(name = "name")
    String name;

    @Column(name = "sex")
    String sex;

    @Column(name = "tea_grade")
    String teaGrade;

    @Column(name = "card")
    String card;

    @Column(name = "status")
    String status;

    @Column(name = "mobile")
    String mobile;

    @Column(name = "school")
    String school;

    @Column(name = "province")
    String province;

    @Column(name = "city")
    String city;

    @Column(name = "area")
    String area;

    @Column(name = "brief")
    String brief;

    @Column(name = "is_exp")
    String isExp;

    public InfoTea(long id, String openid, String nameWx, String name, String sex, String teaGrade, String card, String status, String mobile, String school, String province, String city, String area, String brief,String isExp) {
        this.id = id;
        this.openid = openid;
        this.nameWx = nameWx;
        this.name = name;
        this.sex = sex;
        this.teaGrade = teaGrade;
        this.card = card;
        this.status = status;
        this.mobile = mobile;
        this.school = school;
        this.province = province;
        this.city = city;
        this.area = area;
        this.brief = brief;
        this.isExp = isExp;
    }

    public InfoTea() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNameWx() {
        return nameWx;
    }

    public void setNameWx(String nameWx) {
        this.nameWx = nameWx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTeaGrade() {
        return teaGrade;
    }

    public void setTeaGrade(String teaGrade) {
        this.teaGrade = teaGrade;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getIsExp() {
        return isExp;
    }

    public void setIsExp(String isExp) {
        this.isExp = isExp;
    }
}
