package com.junchen.back.service;
import java.util.List;

import com.junchen.back.pojo.ErpAmAddressbook;
import com.junchen.back.myentity.PageResult;
/**
 * amAddressbook服务层接口
 * @author Administrator
 *
 */
public interface AmAddressbookService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpAmAddressbook> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(ErpAmAddressbook amAddressbook);
	
	
	/**
	 * 修改
	 */
	public void update(ErpAmAddressbook amAddressbook);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public ErpAmAddressbook findOne(Long id);
	
	
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
	public PageResult findPage(ErpAmAddressbook amAddressbook, int pageNum,int pageSize);


	public List<String> findCompany();
	
}
