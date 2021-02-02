package com.gyl.tutor.utils;

import javax.persistence.Column;
import java.util.Arrays;

public class StuInfoUtils {

    String openid;
    String nameWx;
    String sex;
    String grade;
    String[] subject;
    String hopeTeaSex;
    String hopeTeaExp;
    String[] address;
    String[] time;

    public StuInfoUtils(String openid, String nameWx, String sex, String grade, String[] subject, String hopeTeaSex, String hopeTeaExp, String[] address, String[] time) {
        this.openid = openid;
        this.nameWx = nameWx;
        this.sex = sex;
        this.grade = grade;
        this.subject = subject;
        this.hopeTeaSex = hopeTeaSex;
        this.hopeTeaExp = hopeTeaExp;
        this.address = address;
        this.time = time;
    }

    public StuInfoUtils() {
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

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public String getHopeTeaSex() {
        return hopeTeaSex;
    }

    public void setHopeTeaSex(String hopeTeaSex) {
        this.hopeTeaSex = hopeTeaSex;
    }

    public String getHopeTeaExp() {
        return hopeTeaExp;
    }

    public void setHopeTeaExp(String hopeTeaExp) {
        this.hopeTeaExp = hopeTeaExp;
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

    @Override
    public String toString() {
        return "StuInfoUtils{" +
                "openid='" + openid + '\'' +
                ", nameWx='" + nameWx + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", subject=" + Arrays.toString(subject) +
                ", hopeTeaSex='" + hopeTeaSex + '\'' +
                ", hopeTeaExp='" + hopeTeaExp + '\'' +
                ", address=" + Arrays.toString(address) +
                ", time=" + Arrays.toString(time) +
                '}';
    }
}
