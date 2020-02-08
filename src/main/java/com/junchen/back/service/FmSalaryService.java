package com.junchen.back.service;
import java.util.List;

import com.junchen.back.pojo.ErpFmSalary;
import com.junchen.back.pojogroup.Salary;
import com.junchen.back.myentity.PageResult;
/**
 * fmSalary服务层接口
 * @author Administrator
 *
 */
public interface FmSalaryService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpFmSalary> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Salary fmSalary);
	
	
	/**
	 * 修改
	 */
	public void update(Salary fmSalary);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Salary findOne(Long id);
	
	
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
	public PageResult findPage(ErpFmSalary fmSalary, int pageNum,int pageSize);


	public List<ErpFmSalary> findStaffList();
	
}
