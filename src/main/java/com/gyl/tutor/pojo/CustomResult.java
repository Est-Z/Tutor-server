package com.gyl.tutor.pojo;

public class CustomResult {
    String msg;
    int status;


    public CustomResult(String msg){
        this.msg = msg;
    }

    public CustomResult(int status) {
        this.status = status;
    }

    public CustomResult(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
