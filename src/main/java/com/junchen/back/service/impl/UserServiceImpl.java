package com.junchen.back.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.junchen.back.mapper.ErpSysUserMapper;
import com.junchen.back.pojo.ErpSysUser;
import com.junchen.back.service.UserService;


@Service()
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private ErpSysUserMapper userMapper;

//	@Override
//	public User login(String user_loginName,String user_password) {
//		return userMapper.login(user_loginName,user_password);
//	}

	@Override
	public ErpSysUser login(String user_loginName) {
		// TODO Auto-generated method stub
		return userMapper.login(user_loginName);
	}

}
