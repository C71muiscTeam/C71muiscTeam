package com.yc.C71S3Tstsmuisc.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C71S3Tstsmuisc.bean.Admin;
import com.yc.C71S3Tstsmuisc.bean.AdminExample;
import com.yc.C71S3Tstsmuisc.dao.AdminMapper;



@Service
public class AdminBiz {
	
	@Resource
	private AdminMapper am;

	public List<Admin> loginUser(Admin admin){
		AdminExample ae = new AdminExample();
		ae.createCriteria()
		.andANameEqualTo(admin.getaName())
		.andAPasswordEqualTo(admin.getaPassword());
		
		return am.selectByExample(ae);
		
	}
	
}
