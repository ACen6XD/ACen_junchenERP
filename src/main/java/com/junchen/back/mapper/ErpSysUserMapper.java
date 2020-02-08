package com.junchen.back.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.junchen.back.pojo.ErpSysUser;

/**
 * 用户后台登录持久层接口类
 * @author 岑洛彬
 *
 */
@Repository
public interface ErpSysUserMapper {
	/**
	 * 判断用户可否登入
	 * @param user_loginname
	 * @param password
	 * @return
	 */
//	User login(@Param("loginName")String loginName,@Param("password")String password);
	
	ErpSysUser login(@Param("loginName")String loginName);
}
