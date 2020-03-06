package com.yc.C71S3Tstsmuisc.Administrator;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yc.C71S3Tstsmuisc.bean.Music;
import com.yc.C71S3Tstsmuisc.biz.AlbumBiz;
import com.yc.C71S3Tstsmuisc.biz.MusicBiz;
import com.yc.C71S3Tstsmuisc.biz.SingerBiz;

@Controller
public class AdministratorAction {
	@Resource
	private MusicBiz mb;
	@Resource
	private SingerBiz sb;
	@Resource
	private AlbumBiz ab;

	@GetMapping("/Administrator/right.html")
	public String right(Model model) {

		model.addAttribute("musics", selectMusic(1));
		return "Administrator/right";
	}
	@GetMapping("/Administrator/pageMusic")
	public String pageMusic(@RequestParam int pageNum,Model model) {
		model.addAttribute("musics", selectMusic(pageNum));
		return "Administrator/right";
	}
	
	public PageInfo<Music> selectMusic(int pageNum) {
		List<Music> musics = mb.selectByCheck(pageNum);

		for (Music m : musics) {

			m.setSinger(sb.selectById(m.getmSingerid()).get(0));
			if (m.getmAlbumid() != null) {
				m.setAlbum(ab.selectById(m.getmAlbumid()).get(0));
			}
		}
		PageInfo<Music> music = new PageInfo<Music>(musics);

		return music;

	}

	@GetMapping("/Administrator/imgtable.html")
	public String imgtable() {

		return "Administrator/imgtable";
	}

	@GetMapping("/Administrator/form.html")
	public String form() {

		return "Administrator/form";
	}

	@GetMapping("/Administrator/upload1.html")
	public String upload() {

		return "Administrator/upload1";
	}

	@GetMapping("/Administrator/imglist.html")
	public String imglist() {

		return "Administrator/imglist";
	}

	@GetMapping("/Administrator/tools.html")
	public String tools() {

		return "Administrator/tools";
	}

	@GetMapping("/Administrator/filelist.html")
	public String filelist() {

		return "Administrator/filelist";
	}

	@GetMapping("/Administrator/tab.html")
	public String tab() {

		return "Administrator/tab";
	}

	@GetMapping("/Administrator/imglist1.html")
	public String imglist1() {

		return "Administrator/imglist1";
	}

	@GetMapping("/Administrator/error.html")
	public String error() {

		return "Administrator/error";
	}

	@GetMapping("/Administrator/login.html")
	public String login() {

		return "Administrator/login";
	}

	@GetMapping("/Administrator/register.html")
	public String register() {
		return "/Administrator/register";
	}

}
