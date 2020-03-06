package com.yc.C71S3Tstsmuisc.bean;

import java.util.Date;
import java.util.List;

public class Album {
    private Integer id;

    private Integer alSingerid;

    private String alName;

    private Date alTime;

    private Integer alDownloads;

    private String alPicture;
    
    private Singer singer;
    
    private List<Music> musics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlSingerid() {
        return alSingerid;
    }

    public void setAlSingerid(Integer alSingerid) {
        this.alSingerid = alSingerid;
    }

    public String getAlName() {
        return alName;
    }

    public void setAlName(String alName) {
        this.alName = alName == null ? null : alName.trim();
    }

    public Date getAlTime() {
        return alTime;
    }

    public void setAlTime(Date alTime) {
        this.alTime = alTime;
    }

    public Integer getAlDownloads() {
        return alDownloads;
    }

    public void setAlDownloads(Integer alDownloads) {
        this.alDownloads = alDownloads;
    }

    public String getAlPicture() {
        return alPicture;
    }

    public void setAlPicture(String alPicture) {
        this.alPicture = alPicture == null ? null : alPicture.trim();
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
	 * @return the musics
	 */
	public List<Music> getMusics() {
		return musics;
	}

	/**
	 * @param musics the musics to set
	 */
	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	
}