package com.yc.C71S3Tstsmuisc.bean;

import java.util.Date;

public class Songlist {
    private Integer lId;

    private String lName;

    private Integer lUserid;

    private Date lTime;

    private String lIntro;

    private Integer lCollect;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
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

    public Integer getlCollect() {
        return lCollect;
    }

    public void setlCollect(Integer lCollect) {
        this.lCollect = lCollect;
    }
}