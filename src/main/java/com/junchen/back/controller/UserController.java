package com.junchen.back.controller;
/**
 * 用户的表现层控制类
 */
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.junchen.back.myentity.Result;
import com.junchen.back.pojo.ErpSysUser;
import com.junchen.back.service.AmStaffService;
import com.junchen.back.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	/**
	 * 登入
	 * @param user_loginName
	 * @param user_password
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/login")
	public Result login(String user_loginName,String user_password){
		Subject currentUser = SecurityUtils.getSubject();
		
		if (!currentUser.isAuthenticated()) {
        	// 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(user_loginName, user_password);
            token.setRememberMe(true);
            try {
            	// 执行登录. 
                currentUser.login(token);
            } 
            // ... catch more exceptions here (maybe custom ones specific to your application?
            // 所有认证时异常的父类. 
            catch (UnknownAccountException ae) {
            	return new Result(false,ae.getMessage());
            }catch(AuthenticationException e){
            	return new Result(false,"账号密码错误！");
            }
        }
		return new Result(true,"/admin/index.html");
	}
	


}
