package com.junchen.back.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmRulesMapper;
import com.junchen.back.pojo.ErpAmRules;
import com.junchen.back.pojo.ErpAmRulesExample;
import com.junchen.back.pojo.ErpAmRulesExample.Criteria;
import com.junchen.back.service.AmRulesService;

import com.junchen.back.myentity.PageResult;

/**
 * amRules服务实现层
 * @author Administrator
 *
 */
@Service
public class AmRulesServiceImpl implements AmRulesService {

	@Autowired
	private ErpAmRulesMapper amRulesMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmRules> findAll() {
		return amRulesMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmRules> page=   (Page<ErpAmRules>) amRulesMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpAmRules amRules) {
		amRulesMapper.insert(amRules);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpAmRules amRules){
		amRulesMapper.updateByPrimaryKey(amRules);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpAmRules findOne(Long id){
		return amRulesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amRulesMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmRules amRules, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmRulesExample example=new ErpAmRulesExample();
		Criteria criteria = example.createCriteria();
		
		if(amRules!=null){			
			if(amRules.getRulesName()!=null && amRules.getRulesName().length()>0){
				criteria.andRulesNameLike("%"+amRules.getRulesName()+"%");
			}
			if(amRules.getRulesStaff()!=null){
				if(amRules.getRulesStaff().getStaffId()!= null && !"".equals(amRules.getRulesStaff().getStaffId())){
					criteria.andRulesStaffEqualTo(amRules.getRulesStaff().getStaffId());		
				}
			}
		}
		
		Page<ErpAmRules> page= (Page<ErpAmRules>)amRulesMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<ErpAmRules> findByStaffId() {
			// TODO Auto-generated method stub
			return amRulesMapper.selectByStaffId();
		}
	
}
