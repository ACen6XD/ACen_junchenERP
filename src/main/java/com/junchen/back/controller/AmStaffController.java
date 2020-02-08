package com.junchen.back.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.junchen.back.pojo.ErpAmStaff;
import com.junchen.back.pojo.ErpSysUser;
import com.junchen.back.service.AmStaffService;
import com.junchen.back.myentity.PageResult;
import com.junchen.back.myentity.Result;
/**
 * amStaffcontroller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/amStaff")
public class AmStaffController {

	@Autowired
	private AmStaffService amStaffService;
	
	/**
	 * 进入主界面时候自动加载，获取当前登入的用户
	 * @param session
	 * @return
	 */
	@RequestMapping("/findLoginStaff")
	public ErpAmStaff findLoginStaff(Model model){
		//从shiro的session中取activeUser
		Subject subject = SecurityUtils.getSubject();
		//取身份信息
		ErpSysUser loginUser = (ErpSysUser) subject.getPrincipal();
		//获取到当前登入的用户id
		ErpAmStaff erpAmStaff = amStaffService.findLoginStaff(loginUser.getUser_id());
		//根据用户id去查找职员表对应职员的信息
		return erpAmStaff;
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ErpAmStaff> findAll(){			
		return amStaffService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return amStaffService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param amStaff
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody ErpAmStaff amStaff){
		try {
			amStaffService.add(amStaff);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param amStaff
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody  ErpAmStaff amStaff){
		try {
			amStaffService.update(amStaff);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public  ErpAmStaff findOne(Long id){
			return amStaffService.findOne(id);					
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			amStaffService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody  ErpAmStaff amStaff, int page, int rows  ){
		return amStaffService.findPage(amStaff, page, rows);		
	}
	
	/**
	 * 查找离职名单
	 * @param amStaff
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/findQuitList")
	public List<ErpAmStaff> findQuitList(){
		return (List<ErpAmStaff>) amStaffService.findQuitList();		
	}
	
}
