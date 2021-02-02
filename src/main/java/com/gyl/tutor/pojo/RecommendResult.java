package com.gyl.tutor.pojo;

public class RecommendResult {

    private String sex;
    private String status;
    private String nameWx;
    private String subject;
    private String time;
    private String address;
    private String mobile;
    private String brief;

    public RecommendResult(String sex, String status, String nameWx, String subject, String time, String address, String mobile, String brief) {
        this.sex = sex;
        this.status = status;
        this.nameWx = nameWx;
        this.subject = subject;
        this.time = time;
        this.address = address;
        this.mobile = mobile;
        this.brief = brief;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameWx() {
        return nameWx;
    }

    public void setNameWx(String nameWx) {
        this.nameWx = nameWx;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
