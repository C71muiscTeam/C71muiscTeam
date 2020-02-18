package com.yc.C71S3Tsttmuisc.Administrator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministratorAction {
	@GetMapping({"/Administrator/index.html"})
	public String index() {
		
		return "Administrator/index";
	}

	@GetMapping("/Administrator/main.html")
	public String main() {
		
		return "Administrator/main";
	}

	@GetMapping("/Administrator/top.html")
	public String top() {
		
		return "Administrator/top";
	}
	
	@GetMapping("/Administrator/left.html")
	public String left() {
		
		return "Administrator/left";
	}

}
