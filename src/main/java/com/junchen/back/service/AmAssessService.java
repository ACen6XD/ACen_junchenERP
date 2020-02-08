package com.junchen.back.service;
import java.util.List;

import com.junchen.back.pojo.ErpAmAssess;
import com.junchen.back.pojogroup.Assess;
import com.junchen.back.myentity.PageResult;
/**
 * amAssess服务层接口
 * @author Administrator
 *
 */
public interface AmAssessService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpAmAssess> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Assess amAssess);
	
	
	/**
	 * 修改
	 */
	public void update(Assess amAssess);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Assess findOne(Long id);
	
	
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
	public PageResult findPage(ErpAmAssess amAssess, int pageNum,int pageSize);
	
}
