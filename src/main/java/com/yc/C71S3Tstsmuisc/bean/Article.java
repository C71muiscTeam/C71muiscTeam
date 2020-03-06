package com.yc.C71S3Tstsmuisc.bean;

import java.util.Date;

public class Article {
    private Integer id;

    private String bTitle;

    private String bAuthor;

    private Date bCreatetime;

    private Integer bReadcnt;

    private Integer bAgreecnt;

    private Integer bCommcnt;

    private String bContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle == null ? null : bTitle.trim();
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor == null ? null : bAuthor.trim();
    }

    public Date getbCreatetime() {
        return bCreatetime;
    }

    public void setbCreatetime(Date bCreatetime) {
        this.bCreatetime = bCreatetime;
    }

    public Integer getbReadcnt() {
        return bReadcnt;
    }

    public void setbReadcnt(Integer bReadcnt) {
        this.bReadcnt = bReadcnt;
    }

    public Integer getbAgreecnt() {
        return bAgreecnt;
    }

    public void setbAgreecnt(Integer bAgreecnt) {
        this.bAgreecnt = bAgreecnt;
    }

    public Integer getbCommcnt() {
        return bCommcnt;
    }

    public void setbCommcnt(Integer bCommcnt) {
        this.bCommcnt = bCommcnt;
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent == null ? null : bContent.trim();
    }
}