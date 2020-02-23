package com.yc.C71S3Tstsmuisc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexAction {
	
	@GetMapping({"/","/index","/index.html"})
	public String index() {
		
		return "web/index";
	}
	@GetMapping("/single.html")
	public String single() {
		
		return "web/single";
	}
	@GetMapping("/radio.html")
	public String radio() {
		
		return "web/radio";
	}
	@GetMapping("/blog.html")
	public String blog() {
		
		return "web/blog";
	}
	@GetMapping("/contact.html")
	public String contact() {
		
		return "web/contact";
	}
	@GetMapping("/typography.html")
	public String typography() {
		
		return "web/typography";
	}
	@GetMapping("/browse.html")
	public String browse() {
		
		return "web/browse";
	}
	

}
