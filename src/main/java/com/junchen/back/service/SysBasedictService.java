package com.junchen.back.service;
import java.util.List;

import com.junchen.back.pojo.ErpSysBasedict;
import com.junchen.back.myentity.PageResult;
/**
 * sysBasedict服务层接口
 * @author Administrator
 *
 */
public interface SysBasedictService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<ErpSysBasedict> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(ErpSysBasedict sysBasedict);
	
	
	/**
	 * 修改
	 */
	public void update(ErpSysBasedict sysBasedict);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public ErpSysBasedict findOne(String id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(ErpSysBasedict sysBasedict, int pageNum,int pageSize);

	/**
	 * 根据类别代码查找出具体类别
	 * @param typeCode
	 * @return
	 */
	public List<ErpSysBasedict> findDict(String typeCode);
	
}
