package com.yc.C71S3Tstsmuisc.Administrator;

import javax.annotation.Resource;
import javax.validation.Valid;


import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.C71S3Tstsmuisc.Administrator.vo.Result;
import com.yc.C71S3Tstsmuisc.bean.Admin;
import com.yc.C71S3Tstsmuisc.biz.AdminBiz;

@RestController
public class RegisterAction {
	@Resource
	private AdminBiz ab;
	
	
	
	@PostMapping("Administrator/register")
	public Result reg(@Valid Admin admin,Errors errors,Model model) {
		try {
		if(errors.hasErrors()) {
			return new Result(-1,"用户名或密码不能为空",errors.getFieldErrors());
		}
		if(ab.select(admin).size()!=0) {
			return new Result(-1,"该用户名已存在");
		}
		
		if(ab.insert(admin)==1) {
			return new Result(0,"注册成功",admin);	
		}else {
			return new Result(1,"系统繁忙，请稍后在试！");	
		}
		
		}catch (Exception e) {
			return new Result(1,"系统繁忙，请稍后在试！");	
		}
		
		
	}
}
