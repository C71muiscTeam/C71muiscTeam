package com.yc.C71S3Tstsmuisc.bean;

public class Singer {
    private Integer id;

    private String sName;

    private String sGender;

    private String sPicture;

    private String sIntro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender == null ? null : sGender.trim();
    }

    public String getsPicture() {
        return sPicture;
    }

    public void setsPicture(String sPicture) {
        this.sPicture = sPicture == null ? null : sPicture.trim();
    }

    public String getsIntro() {
        return sIntro;
    }

    public void setsIntro(String sIntro) {
        this.sIntro = sIntro == null ? null : sIntro.trim();
    }
}