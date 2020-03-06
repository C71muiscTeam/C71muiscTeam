package com.yc.C71S3Tstsmuisc.bean;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Music implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    @NotEmpty
    private String mName;
    @NotNull
    private Integer mSingerid;

    private Integer mAlbumid;

    private String mType;

    private Integer mDownloads;

    private String mPicture;

    private String mLanguage;

    private Integer mCheck;

    private Singer singer;
    
    private Album album;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getmAlbumid() {
        return mAlbumid;
    }

    public void setmAlbumid(Integer mAlbumid) {
        this.mAlbumid = mAlbumid;
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

    public Integer getmCheck() {
        return mCheck;
    }

    public void setmCheck(Integer mCheck) {
        this.mCheck = mCheck;
    }

	/**
	 * @return the singer
	 */
	public Singer getSinger() {
		return singer;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	/**
	 * @return the album
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * @param album the album to set
	 */
	public void setAlbum(Album album) {
		this.album = album;
	}
}