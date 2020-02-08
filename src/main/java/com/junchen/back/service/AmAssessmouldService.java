package com.junchen.back.service;
import java.util.List;

import com.junchen.back.pojo.ErpAmAssessmould;
import com.junchen.back.pojogroup.Assessmould;
import com.junchen.back.myentity.PageResult;
/**
 * amAssessmould服务层接口
 * @author Administrator
 *
 */
public interface AmAssessmouldService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpAmAssessmould> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Assessmould amAssessmould);
	
	
	/**
	 * 修改
	 */
	public void update(Assessmould amAssessmould);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Assessmould findOne(Long id);
	
	
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
	public PageResult findPage(ErpAmAssessmould amAssessmould, int pageNum,int pageSize);
	
}
