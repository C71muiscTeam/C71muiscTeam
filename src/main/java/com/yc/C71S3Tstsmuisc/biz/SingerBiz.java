package com.yc.C71S3Tstsmuisc.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C71S3Tstsmuisc.bean.Singer;
import com.yc.C71S3Tstsmuisc.bean.SingerExample;
import com.yc.C71S3Tstsmuisc.dao.SingerMapper;

@Service
public class SingerBiz {
	
	@Resource
	private SingerMapper sm;
	
	public List<Singer> selectById(int id) {
		SingerExample se = new SingerExample();
		se.createCriteria().andIdEqualTo(id);
		return  sm.selectByExample(se);
	}

	public List<Singer> selectBysName(String singerName) {
		// TODO Auto-generated method stub
		SingerExample se = new SingerExample();
		se.createCriteria().andSNameEqualTo(singerName);
		return sm.selectByExample(se);
	}

}
