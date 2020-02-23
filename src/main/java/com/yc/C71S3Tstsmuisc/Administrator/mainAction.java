package com.yc.C71S3Tstsmuisc.Administrator;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.C71S3Tstsmuisc.bean.Admin;
import com.yc.C71S3Tstsmuisc.bean.User;


@Controller
@SessionAttributes("loginedUser")
public class mainAction {
	
	
	@GetMapping("/Administrator/main.html")
	public String main(HttpSession session,Model model) {
		Object user =  session.getAttribute("loginedUser");
		if(user!=null) {
			model.addAttribute("loginedUser",user);
			return "Administrator/main";
		}else {
			
			
			return "Administrator/login";
		}
		
		
	}
	@GetMapping("/Administrator/top.html")
	public String top(@SessionAttribute("loginedUser")Admin admin,Model model) {
		model.addAttribute("loginedUser",admin);
		return "Administrator/top";
	}
	@GetMapping({"/Administrator/index.html"})
	public String index(@SessionAttribute("loginedUser")Admin admin,Model model) {
		model.addAttribute("loginedUser",admin);
		return "Administrator/index";
	}
	@GetMapping("/Administrator/left.html")
	public String left(@SessionAttribute("loginedUser")Admin admin,Model model) {
		model.addAttribute("loginedUser",admin);
		return "Administrator/left";
	}
}
