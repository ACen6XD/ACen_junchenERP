package com.junchen.back.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.junchen.back.pojo.ErpSysUser;
import com.junchen.back.service.UserService;
/**
 * 自定义用户登陆验证类
 * @author 岑洛彬
 *
 */
public class ShiroRealm extends AuthenticatingRealm{
	/**
	 * 依赖注入
	 */
	@Autowired
	private UserService userService;
	
	

	/**
	 * 登入认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		//1、把AuthenticationToken 转化为UsernamePasswordToken
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		//2、从UsernamePasswordToken中获取username
		String loginName = String.valueOf(upToken.getUsername());
		//3、调用数据库方法，从数据库中查询username相应的用户记录
		ErpSysUser user = userService.login(loginName);
		//4、若用户不存在，则返回null
		if(user == null){
			throw new UnknownAccountException("账户"+loginName+"不存在！");
		}
		//用户存在
		if(user.getUser_staffid() == null){
			throw new UnknownAccountException("账户"+loginName+"未绑定，请联系工作人员进行绑定！");
		}
		//6、输入正确的账号和密码，交给shiro来比较。
		String realName = getName();
		
		//加盐
		ByteSource credentialSalts = ByteSource.Util.bytes(loginName);
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getUser_password(),credentialSalts,realName);
		return info;
	}
	
	public static void main(String[] args) {
		Object result = new SimpleHash("MD5","3","3",1);//加密的算法，加密的密码，加密的盐值，加密的次数
		System.out.println(result);
//		SimpleDateFormat df = new SimpleDateFormat("MM" + File.separator +"dd"+ File.separator +"HH" + File.separator +"mm"+ File.separator +"SS"); 
//		String string = df.format(new Date());
//		System.out.println(string);
	}


	




}
