package com.yc.C71S3Tstsmuisc.bean;

public class Music {
    private Integer mId;

    private String mName;

    private Integer mSingerid;

    private Integer mAlbum;

    private String mType;

    private Integer mDownloads;

    private String mPicture;

    private String mLanguage;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmSingerid() {
        return mSingerid;
    }

    public void setmSingerid(Integer mSingerid) {
        this.mSingerid = mSingerid;
    }

    public Integer getmAlbum() {
        return mAlbum;
    }

    public void setmAlbum(Integer mAlbum) {
        this.mAlbum = mAlbum;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType == null ? null : mType.trim();
    }

    public Integer getmDownloads() {
        return mDownloads;
    }

    public void setmDownloads(Integer mDownloads) {
        this.mDownloads = mDownloads;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture == null ? null : mPicture.trim();
    }

    public String getmLanguage() {
        return mLanguage;
    }

    public void setmLanguage(String mLanguage) {
        this.mLanguage = mLanguage == null ? null : mLanguage.trim();
    }
}