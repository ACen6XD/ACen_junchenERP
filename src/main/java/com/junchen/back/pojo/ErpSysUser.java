package com.junchen.back.pojo;

import java.io.Serializable;

/**
 * 后台登录用户实体类
 * @author 岑洛彬
 *
 */
public class ErpSysUser implements Serializable{
	private Long user_id;
	private String user_loginName;
	private String user_password;
	private String user_permission;
	private String user_role;
	private Long user_staffid;
	private Character user_enable;
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	public Long getUser_staffid() {
		return user_staffid;
	}
	public void setUser_staffid(Long user_staffid) {
		this.user_staffid = user_staffid;
	}
	public String getUser_loginName() {
		return user_loginName;
	}
	public void setUser_loginName(String user_loginName) {
		this.user_loginName = user_loginName;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_permission() {
		return user_permission;
	}
	public void setUser_permission(String user_permission) {
		this.user_permission = user_permission;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	public Character getUser_enable() {
		return user_enable;
	}
	public void setUser_enable(Character user_enable) {
		this.user_enable = user_enable;
	}
	public ErpSysUser(Long user_id, String user_loginName, String user_password,
			String user_permission, String user_role, Long user_staffid,
			Character user_enable) {
		super();
		this.user_id = user_id;
		this.user_loginName = user_loginName;
		this.user_password = user_password;
		this.user_permission = user_permission;
		this.user_role = user_role;
		this.user_staffid = user_staffid;
		this.user_enable = user_enable;
	}
	public ErpSysUser() {
		super();
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_loginName="
				+ user_loginName + ", user_password=" + user_password
				+ ", user_permission=" + user_permission + ", user_role="
				+ user_role + ", user_staffid=" + user_staffid.toString()
				+ ", user_enable=" + user_enable + "]";
	}
	
	
	
}
