package com.yc.C71S3Tsttmuisc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexAction {
	
	@GetMapping({"/","/index","/index.html"})
	public String index() {
		
		return "index";
	}

}
