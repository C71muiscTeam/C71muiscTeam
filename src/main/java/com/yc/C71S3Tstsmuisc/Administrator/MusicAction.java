package com.yc.C71S3Tstsmuisc.Administrator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.yc.C71S3Tstsmuisc.Administrator.vo.Result;
import com.yc.C71S3Tstsmuisc.bean.Album;
import com.yc.C71S3Tstsmuisc.bean.Music;
import com.yc.C71S3Tstsmuisc.bean.Singer;
import com.yc.C71S3Tstsmuisc.biz.AlbumBiz;
import com.yc.C71S3Tstsmuisc.biz.MusicBiz;
import com.yc.C71S3Tstsmuisc.biz.SingerBiz;

@Controller
public class MusicAction {
	@Resource
	private MusicBiz mb;
	@Resource
	private SingerBiz sb;
	@Resource
	private AlbumBiz ab;
	@Value("${spring.resources.staticLocations}")
	private String uploadDir;
	

	@GetMapping("/Administrator/check")
	public String check(String id, Model model) {
		int mid = Integer.valueOf(id);
		mb.check(mid);
		model.addAttribute("musics", selectMusic(1));

		return "Administrator/right";
	}

	@GetMapping("/Administrator/checks")
	public String checks(String ids, Model model) {
		String[] mids = ids.split(",");

		for (String id : mids) {
			int mid = Integer.valueOf(id);
			mb.check(mid);

		}
		model.addAttribute("musics", selectMusic(1));

		return "Administrator/right";
	}

	@GetMapping("/Administrator/delete")
	public String delete(String id, Model model) {
		int mid = Integer.valueOf(id);
		mb.delete(mid);
		model.addAttribute("musics", selectMusic(1));

		return "Administrator/right";
	}

	@GetMapping("/Administrator/deletes")
	public String deletes(String ids, Model model) {
		String[] mids = ids.split(",");

		for (String id : mids) {
			int mid = Integer.valueOf(id);
			mb.delete(mid);

		}

		model.addAttribute("musics", selectMusic(1));

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

	public PageInfo<Music> selectAllMusic(int pageNum) {
		List<Music> musics = mb.selectAll(pageNum);

		for (Music m : musics) {

			m.setSinger(sb.selectById(m.getmSingerid()).get(0));
			if (m.getmAlbumid() != null) {
				m.setAlbum(ab.selectById(m.getmAlbumid()).get(0));
			}
		}
		PageInfo<Music> music = new PageInfo<Music>(musics);

		return music;

	}

	@GetMapping("/Administrator/pageMusic1")
	public String pageMusic1(@RequestParam int pageNum, Model model) {
		model.addAttribute("musics", selectAllMusic(pageNum));
		return "Administrator/right2";
	}

	@GetMapping("/Administrator/right2.html")
	public String music(Model model) {
		model.addAttribute("musics", selectAllMusic(1));
		return "Administrator/right2";
	}

	@PostMapping("/Administrator/addMusic")
	@ResponseBody
	public void testMusic(@Valid Music music, Errors errors,@RequestParam(value="file", required = false)MultipartFile file) {
		try {			
			if (errors.hasErrors()) {
				return ;
			}

			if(file!=null) {				
				String path = ResourceUtils.getURL("classpath:").getPath()+"static";
				System.out.println(path);
				String fileName=file.getOriginalFilename();
				File diskfile = new File(path+"/musicImg/"+file.getOriginalFilename());
				music.setmPicture("../musicImg/"+fileName);
				file.transferTo(diskfile);
			}
			System.out.println(music.getmPicture());
			if (music.getId() == null) {
				List<Singer> singers = sb.selectById(music.getmSingerid());

				

				if (singers.size()==0) {

					return ;

				} else if (music.getmAlbumid()!=null && ab.selectById(music.getmAlbumid()).size()==0 ) {
				
						return ;
					
				}else {
					music.setmCheck(0);
					if(mb.insert(music)==1) {
						
						return ;
						
					}else {
						
						return ;
					}
				} 

			} else {
				return ;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return ;
		}

	}

	@PostMapping("/Administrator/testMusic")
	@ResponseBody
	public Result addMusic(@Valid Music music, Errors errors,@RequestParam(value="file", required = false)MultipartFile file) {
		try {			
			if (errors.hasErrors()) {
				return new Result(2, "歌曲姓名或歌手id为必填项！", errors.getFieldError());
			}
			
			
			if (music.getId() == null) {
				List<Singer> singers = sb.selectById(music.getmSingerid());

				

				if (singers.size()==0) {

					return new Result(3, "该歌手不存在");

				} else if (music.getmAlbumid()!=null && ab.selectById(music.getmAlbumid()).size()==0 ) {
				
						return new Result(4, "该专辑不存在");
					
				}else {
											
						return new Result(1, "添加成功");
											
				} 

			} else {
				return new Result(1, "修改成功");
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new Result(-1, "系统繁忙，请稍后在试");
		}

	}
	
	
	
}
