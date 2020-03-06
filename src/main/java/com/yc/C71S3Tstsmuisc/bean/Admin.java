package com.yc.C71S3Tstsmuisc.bean;

import javax.validation.constraints.NotEmpty;

public class Admin {
    private Integer id;
    @NotEmpty
    private String aName;
    @NotEmpty
    private String aPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }
}