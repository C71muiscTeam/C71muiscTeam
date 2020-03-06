package com.yc.C71S3Tstsmuisc.bean;

import java.util.Date;

public class Songlist {
    private Integer id;

    private String lName;

    private Integer lUserid;

    private Date lTime;

    private String lIntro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName == null ? null : lName.trim();
    }

    public Integer getlUserid() {
        return lUserid;
    }

    public void setlUserid(Integer lUserid) {
        this.lUserid = lUserid;
    }

    public Date getlTime() {
        return lTime;
    }

    public void setlTime(Date lTime) {
        this.lTime = lTime;
    }

    public String getlIntro() {
        return lIntro;
    }

    public void setlIntro(String lIntro) {
        this.lIntro = lIntro == null ? null : lIntro.trim();
    }
}