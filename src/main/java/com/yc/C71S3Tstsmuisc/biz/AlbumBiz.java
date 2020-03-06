package com.yc.C71S3Tstsmuisc.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.yc.C71S3Tstsmuisc.bean.Album;
import com.yc.C71S3Tstsmuisc.bean.AlbumExample;
import com.yc.C71S3Tstsmuisc.dao.AlbumMapper;

@Service
public class AlbumBiz {
	private final int PAGE_SIZE=2;
	
	@Resource
	private AlbumMapper am;
	
	
	public List<Album> selectById(int id) {
		AlbumExample ae = new AlbumExample();
		ae.createCriteria().andIdEqualTo(id);
		return am.selectByExample(ae);
		
	}

	public List<Album> selectByaName(String albumName) {
		AlbumExample ae = new AlbumExample();
		ae.createCriteria().andAlNameEqualTo(albumName);
		return am.selectByExample(ae);
	}

	public List<Album> selectAll(int pageNum) {
		PageHelper.startPage(pageNum, PAGE_SIZE); 
		return am.selectByExample(null);
	}

	
	
}
