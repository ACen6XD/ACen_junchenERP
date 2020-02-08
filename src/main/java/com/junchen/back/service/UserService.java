package com.junchen.back.service;

import com.junchen.back.pojo.ErpSysUser;

/**
 * 用户业务逻辑层接口
 * @author 岑洛彬
 *
 */
public interface UserService {

//	public User login(String user_loginName,String user_password);
	
	public ErpSysUser login(String user_loginName);
}
