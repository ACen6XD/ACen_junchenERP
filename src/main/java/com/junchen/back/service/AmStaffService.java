package com.junchen.back.service;
import java.util.List;

import com.junchen.back.pojo.ErpAmStaff;
import com.junchen.back.myentity.PageResult;
/**
 * amStaff服务层接口
 * @author Administrator
 *
 */
public interface AmStaffService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpAmStaff> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(ErpAmStaff amStaff);
	
	
	/**
	 * 修改
	 */
	public void update(ErpAmStaff amStaff);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public ErpAmStaff findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(ErpAmStaff amStaff, int pageNum,int pageSize);

	/**
	 * 根据当前登入的用户，获取用户绑定的员工信息
	 * @param loginUserId
	 * @return
	 */
	public ErpAmStaff findLoginStaff(Long loginUserId);

	/**
	 * 查找离职名单
	 * @return
	 */
	public List<ErpAmStaff> findQuitList();


	
}
