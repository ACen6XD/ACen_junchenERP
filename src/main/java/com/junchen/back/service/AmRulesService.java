package com.junchen.back.service;
import java.util.List;
import com.junchen.back.pojo.ErpAmRules;

import com.junchen.back.myentity.PageResult;
/**
 * amRules服务层接口
 * @author Administrator
 *
 */
public interface AmRulesService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpAmRules> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(ErpAmRules amRules);
	
	
	/**
	 * 修改
	 */
	public void update(ErpAmRules amRules);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public ErpAmRules findOne(Long id);
	
	
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
	public PageResult findPage(ErpAmRules amRules, int pageNum,int pageSize);

	/**
	 * 查找出发表过规章制度的员工的id
	 * @return
	 */
	public List<ErpAmRules> findByStaffId();
	
}
