package com.junchen.back.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmAssesspointMapper;
import com.junchen.back.pojo.ErpAmAssesspoint;
import com.junchen.back.pojo.ErpAmAssesspointExample;
import com.junchen.back.pojo.ErpAmAssesspointExample.Criteria;
import com.junchen.back.service.AmAssesspointService;

import com.junchen.back.myentity.PageResult;

/**
 * amAssesspoint服务实现层
 * @author Administrator
 *
 */
@Service
public class AmAssesspointServiceImpl implements AmAssesspointService {

	@Autowired
	private ErpAmAssesspointMapper amAssesspointMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmAssesspoint> findAll() {
		return amAssesspointMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmAssesspoint> page=   (Page<ErpAmAssesspoint>) amAssesspointMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpAmAssesspoint amAssesspoint) {
		amAssesspointMapper.insert(amAssesspoint);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpAmAssesspoint amAssesspoint){
		amAssesspointMapper.updateByPrimaryKey(amAssesspoint);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpAmAssesspoint findOne(Long id){
		return amAssesspointMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amAssesspointMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmAssesspoint amAssesspoint, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmAssesspointExample example=new ErpAmAssesspointExample();
		Criteria criteria = example.createCriteria();
		
		if(amAssesspoint!=null){			
				
		}
		
		Page<ErpAmAssesspoint> page= (Page<ErpAmAssesspoint>)amAssesspointMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
