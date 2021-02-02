package com.gyl.tutor.middle;

public class TeacherResult {

    String nameWx;
    String name;
    String sex;
    String grade;
    String status;
    String subject;
    String school;
    String address;
    String time;
    String mobile;
    String brief;

    public TeacherResult(String nameWx, String name, String sex, String grade, String status, String subject, String school, String address, String time, String mobile, String brief) {
        this.nameWx = nameWx;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.status = status;
        this.subject = subject;
        this.school = school;
        this.address = address;
        this.time = time;
        this.mobile = mobile;
        this.brief = brief;
    }

    public TeacherResult() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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

    public void addAddress(String address){
        if(this.address==null){
            this.address = address;
        }else {
            this.address = this.address + "、" + address;
        }
    }

    public void addSubject(String subject){
        if(this.subject==null){
            this.subject = subject;
        }else {
            this.subject = this.subject + "、" + subject;
        }
    }

    public void addTime(String time){
        if(this.time==null){
            this.time = time;
        }else {
            this.time = this.time + "、" + time;
        }
    }

    @Override
    public String toString() {
        return "TeacherResult{" +
                "nameWx='" + nameWx + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", status='" + status + '\'' +
                ", subject='" + subject + '\'' +
                ", school='" + school + '\'' +
                ", address='" + address + '\'' +
                ", time='" + time + '\'' +
                ", mobile='" + mobile + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }
}
