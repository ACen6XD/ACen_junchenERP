package com.junchen.back.myentity;

import java.io.Serializable;

/**
 * 自定义实体类---结果
 * 用于返回操作后的成功与否
 * @author 岑洛彬
 *
 */
public class Result implements Serializable{
	private boolean success;
	private String msg;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Result(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}
	
}
