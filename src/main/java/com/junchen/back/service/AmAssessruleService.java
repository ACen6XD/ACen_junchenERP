package com.junchen.back.service;
import java.util.List;
import com.junchen.back.pojo.ErpAmAssessrule;

import com.junchen.back.myentity.PageResult;
/**
 * amAssessrule服务层接口
 * @author Administrator
 *
 */
public interface AmAssessruleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpAmAssessrule> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(ErpAmAssessrule amAssessrule);
	
	
	/**
	 * 修改
	 */
	public void update(ErpAmAssessrule amAssessrule);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public ErpAmAssessrule findOne(Long id);
	
	
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
	public PageResult findPage(ErpAmAssessrule amAssessrule, int pageNum,int pageSize);
	
}
