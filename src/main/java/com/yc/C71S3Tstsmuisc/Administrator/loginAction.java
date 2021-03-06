package com.yc.C71S3Tstsmuisc.Administrator;



import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.C71S3Tstsmuisc.Administrator.vo.Result;
import com.yc.C71S3Tstsmuisc.bean.Admin;
import com.yc.C71S3Tstsmuisc.biz.AdminBiz;

@RestController
@SessionAttributes("loginedUser")
public class loginAction {
	@Resource//管理员sss
	private AdminBiz ub;
	
	@PostMapping("Administrator/login")
	public Result login(@Valid Admin admin,Errors errors, Model m) {	
		try {
			
			if(errors.hasErrors()) {
				return new Result(-1,"表单验证错误",errors.getFieldErrors());
			}
			
		 
			List<Admin> users = ub.loginUser(admin);
			if(users.size()==1) {
				m.addAttribute("loginedUser",admin);
				return new Result(0,"登录成功",admin);
			}else {
				return new Result(-1,"账号或密码错误");
			}
		
			
		
		}catch (RuntimeException e) {
			e.printStackTrace();
			return new Result(1,"业务繁忙稍后再试");
			
			
		}
		
		
		
	}

}
