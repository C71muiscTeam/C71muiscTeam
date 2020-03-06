package com.yc.C71S3Tstsmuisc.Administrator;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.pagehelper.PageInfo;
import com.yc.C71S3Tstsmuisc.bean.Album;
import com.yc.C71S3Tstsmuisc.bean.Music;
import com.yc.C71S3Tstsmuisc.biz.AlbumBiz;
import com.yc.C71S3Tstsmuisc.biz.MusicBiz;
import com.yc.C71S3Tstsmuisc.biz.SingerBiz;

@Controller
public class AlbumAction {
	@Resource
	private SingerBiz sb;
	@Resource
	private AlbumBiz ab;
	@Resource
	private MusicBiz mb;
	
	@GetMapping("/Administrator/album.html")
	public String album(String id, Model model ) {
		int album_id = 1;
		if(id.isEmpty()==false) {
			album_id = Integer.valueOf(id);
		}
		model.addAttribute("albums",selectAlbum(album_id));
		return "Administrator/album";
	}
	public PageInfo<Album> selectAlbum(int pageNum) {
		List<Album> albums = ab.selectAll(pageNum);

		for (Album a : albums) {

			a.setSinger(sb.selectById(a.getAlSingerid()).get(0));
			
			a.setMusics(mb.selectByAlbumId( a.getId() ) );
			
		}
		PageInfo<Album> album = new PageInfo<Album>(albums);

		return album;

	}
}
