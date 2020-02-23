package com.yc.C71S3Tstsmuisc.Administrator.vo;

public class Result {
	
	private int code;//返回的结果码
	
	private String msg;//返回的消息
	
	private Object Data;//返回的数据
	
	
	

	public Result() {
		super();
	}

	public Result(int code) {
		super();
		this.code = code;
	}

	

	public Result(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public Result(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		Data = data;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	
	
	
	
}
