package com.junchen.back.service;
import java.util.List;
import com.junchen.back.pojo.ErpAmLogbook;

import com.junchen.back.myentity.PageResult;
/**
 * amLogbook服务层接口
 * @author Administrator
 *
 */
public interface AmLogbookService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpAmLogbook> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(ErpAmLogbook amLogbook);
	
	
	/**
	 * 修改
	 */
	public void update(ErpAmLogbook amLogbook);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public ErpAmLogbook findOne(Long id);
	
	
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
	public PageResult findPage(ErpAmLogbook amLogbook, int pageNum,int pageSize);

	/**
	 * 加载按姓名搜索下拉框中的数据
	 * @return
	 */
	public List<ErpAmLogbook> findStaffList();
	
}
