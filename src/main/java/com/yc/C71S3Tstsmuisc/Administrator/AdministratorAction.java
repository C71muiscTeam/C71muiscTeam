package com.yc.C71S3Tstsmuisc.Administrator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministratorAction {
	

	
	
	
	
	
	@GetMapping("/Administrator/right.html")
	public String right() {
		
		return "Administrator/right";
	}
	
	
	@GetMapping("/Administrator/imgtable.html")
	public String imgtable() {
		
		return "Administrator/imgtable";
	}
	
	@GetMapping("/Administrator/form.html")
	public String form() {
		
		return "Administrator/form";
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
