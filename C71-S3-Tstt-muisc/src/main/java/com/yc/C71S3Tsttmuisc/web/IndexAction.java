package com.yc.C71S3Tsttmuisc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexAction {
	
	@GetMapping({"/","/index","/index.html"})
	public String index() {
		
		return "index";
	}
	@GetMapping("/single.html")
	public String single() {
		
		return "single";
	}
	@GetMapping("/radio.html")
	public String radio() {
		
		return "radio";
	}
	@GetMapping("/blog.html")
	public String blog() {
		
		return "blog";
	}
	@GetMapping("/contact.html")
	public String contact() {
		
		return "contact";
	}
	@GetMapping("/typography.html")
	public String typography() {
		
		return "typography";
	}
	@GetMapping("/browse.html")
	public String browse() {
		
		return "browse";
	}
	

}
