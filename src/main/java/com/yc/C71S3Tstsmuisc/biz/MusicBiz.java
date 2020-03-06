package com.yc.C71S3Tstsmuisc.biz;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.yc.C71S3Tstsmuisc.bean.Music;
import com.yc.C71S3Tstsmuisc.bean.MusicExample;
import com.yc.C71S3Tstsmuisc.dao.MusicMapper;

@Service
public class MusicBiz {
	private final int PAGE_SIZE=2;
	
	@Resource
	private MusicMapper mm;
	
	public List<Music> selectAll(int pageNum){
		PageHelper.startPage(pageNum, PAGE_SIZE);
	return	mm.selectByExample(null);
		
		
	}

	
	
	public List<Music> selectByCheck(int pageNum){
		
		
		MusicExample me = new MusicExample();
		me.createCriteria().andMCheckNotEqualTo(1);
		
		PageHelper.startPage(pageNum, PAGE_SIZE);
		return mm.selectByExample(me);
		
	}

	public void check(int id) {
		Music music = selectByPrimaryKey(id);
		music.setmCheck(1);
		mm.updateByPrimaryKey(music);
	}
	
	public Music selectByPrimaryKey(int id) {
		
		return mm.selectByPrimaryKey(id);
	}

	public void delete(int id) {
		mm.deleteByPrimaryKey(id);
		
	}

	/**
	 * @return the pAGE_SIZE
	 */
	public int getPAGE_SIZE() {
		return PAGE_SIZE;
	}



	public int  insert(@Valid Music music) {
		
		return mm.insert(music);
	}



	public List<Music> selectByAlbumId(Integer album_id) {
		MusicExample me = new MusicExample();
		me.createCriteria().andMAlbumidEqualTo(album_id);
		return mm.selectByExample(me);
		
	}
	
}
