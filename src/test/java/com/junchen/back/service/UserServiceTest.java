package com.junchen.back.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.junchen.back.pojo.ErpSysUser;

public class UserServiceTest extends BaseJunit4Class{
	@Autowired
	private UserService userService;
	
	@Test
	public void testLogin() {
		ErpSysUser user = userService.login("1");
		System.out.println(user.toString());
	}

}
