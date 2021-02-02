package com.gyl.tutor.utils;

import java.util.Arrays;

public class TeaInfoUtils {

    String openid;
    String nameWx;
    String name;
    String sex;
    String grade;
    String card;
    String status;
    String[] subject;
    String school;
    String[] address;
    String[] time;
    String mobile;
    String brief;

    public TeaInfoUtils(String openid, String nameWx, String name, String sex, String grade, String card, String status, String[] subject, String school, String[] address, String[] time, String mobile, String brief) {
        this.openid = openid;
        this.nameWx = nameWx;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.card = card;
        this.status = status;
        this.subject = subject;
        this.school = school;
        this.address = address;
        this.time = time;
        this.mobile = mobile;
        this.brief = brief;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getTime() {
        return time;
    }

    public void setTime(String[] time) {
        this.time = time;
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

    @Override
    public String toString() {
        return "TeaInfoUtils{" +
                "openid='" + openid + '\'' +
                ", nameWx='" + nameWx + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", card='" + card + '\'' +
                ", status='" + status + '\'' +
                ", subject=" + Arrays.toString(subject) +
                ", school='" + school + '\'' +
                ", address=" + Arrays.toString(address) +
                ", time=" + Arrays.toString(time) +
                ", mobile='" + mobile + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }
}
