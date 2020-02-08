package com.junchen.back.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmAssessruleMapper;
import com.junchen.back.pojo.ErpAmAssessrule;
import com.junchen.back.pojo.ErpAmAssessruleExample;
import com.junchen.back.pojo.ErpAmAssessruleExample.Criteria;
import com.junchen.back.service.AmAssessruleService;

import com.junchen.back.myentity.PageResult;

/**
 * amAssessrule服务实现层
 * @author Administrator
 *
 */
@Service
public class AmAssessruleServiceImpl implements AmAssessruleService {

	@Autowired
	private ErpAmAssessruleMapper amAssessruleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmAssessrule> findAll() {
		return amAssessruleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmAssessrule> page=   (Page<ErpAmAssessrule>) amAssessruleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpAmAssessrule amAssessrule) {
		amAssessruleMapper.insert(amAssessrule);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpAmAssessrule amAssessrule){
		amAssessruleMapper.updateByPrimaryKey(amAssessrule);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpAmAssessrule findOne(Long id){
		return amAssessruleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amAssessruleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmAssessrule amAssessrule, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmAssessruleExample example=new ErpAmAssessruleExample();
		Criteria criteria = example.createCriteria();
		
		if(amAssessrule!=null){			
						if(amAssessrule.getAssessruleName()!=null && amAssessrule.getAssessruleName().length()>0){
				criteria.andAssessruleNameLike("%"+amAssessrule.getAssessruleName()+"%");
			}
	
		}
		
		Page<ErpAmAssessrule> page= (Page<ErpAmAssessrule>)amAssessruleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
