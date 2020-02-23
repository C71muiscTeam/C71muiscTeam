package com.yc.C71S3Tstsmuisc.bean;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class User {
    private Integer uId;
    @NotEmpty
    private String uName;
    @NotEmpty
    private String uPassword;

    private Integer uType;

    private Date uTime;

    private String uGender;

    private String uAvaor;

    private String uEmail;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuType() {
        return uType;
    }

    public void setuType(Integer uType) {
        this.uType = uType;
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender == null ? null : uGender.trim();
    }

    public String getuAvaor() {
        return uAvaor;
    }

    public void setuAvaor(String uAvaor) {
        this.uAvaor = uAvaor == null ? null : uAvaor.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }
}