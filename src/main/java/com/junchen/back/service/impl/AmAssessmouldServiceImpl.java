package com.junchen.back.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmAssessmouldMapper;
import com.junchen.back.mapper.ErpAmAssessruleMapper;
import com.junchen.back.pojo.ErpAmAssessmould;
import com.junchen.back.pojo.ErpAmAssessmouldExample;
import com.junchen.back.pojo.ErpAmAssessruleExample;
import com.junchen.back.pojo.ErpAmAssessmouldExample.Criteria;
import com.junchen.back.pojo.ErpAmAssessrule;
import com.junchen.back.pojogroup.Assessmould;
import com.junchen.back.service.AmAssessmouldService;
import com.junchen.back.myentity.PageResult;

/**
 * amAssessmould服务实现层
 * @author Administrator
 *
 */
@Service
public class AmAssessmouldServiceImpl implements AmAssessmouldService {

	@Autowired
	private ErpAmAssessmouldMapper amAssessmouldMapper;
	
	@Autowired
	private ErpAmAssessruleMapper amAssessruleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmAssessmould> findAll() {
		return amAssessmouldMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmAssessmould> page=   (Page<ErpAmAssessmould>) amAssessmouldMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Assessmould assessmould) {
		ErpAmAssessmould erpAmAssessmould = assessmould.getAssessmould();
		amAssessmouldMapper.insert(erpAmAssessmould);	
		for (ErpAmAssessrule rule : assessmould.getAssessmouldRules()) {
			rule.setAssessruleMould(erpAmAssessmould.getAssessmouldId());
			amAssessruleMapper.insert(rule);
		}
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Assessmould amAssessmould){
		//涉及到模板细则表中的数据，更新这部分数据时候，通过先全部删除老数据，在逐一添加新数据实现。
		//更新模板基本信息
		amAssessmouldMapper.updateByPrimaryKey(amAssessmould.getAssessmould());
		Long mouldId = amAssessmould.getAssessmould().getAssessmouldId();//获取模板细则附属id
		ErpAmAssessruleExample example = new ErpAmAssessruleExample();//建立删除的条件
		com.junchen.back.pojo.ErpAmAssessruleExample.Criteria criteria = example.createCriteria();
		criteria.andAssessruleMouldEqualTo(mouldId);//设置条件规则
		amAssessruleMapper.deleteByExample(example);//执行条件删除
		for (ErpAmAssessrule rule : amAssessmould.getAssessmouldRules()) {//重新加入模板细则数据
			rule.setAssessruleMould(mouldId);
			amAssessruleMapper.insert(rule);
		}
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Assessmould findOne(Long id){
		Assessmould mould = new Assessmould();
		mould.setAssessmould(amAssessmouldMapper.selectByPrimaryKey(id));
		mould.setAssessmouldRules(amAssessruleMapper.selectByMouldId(id));
		return mould;
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amAssessmouldMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmAssessmould amAssessmould, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmAssessmouldExample example=new ErpAmAssessmouldExample();
		Criteria criteria = example.createCriteria();
		
		if(amAssessmould!=null){			
						if(amAssessmould.getAssessmouldName()!=null && amAssessmould.getAssessmouldName().length()>0){
				criteria.andAssessmouldNameLike("%"+amAssessmould.getAssessmouldName()+"%");
			}
			
			if(amAssessmould.getAssessmouldEnable()!=null && amAssessmould.getAssessmouldEnable().length()>0){
				criteria.andAssessmouldEnableLike("%"+amAssessmould.getAssessmouldEnable()+"%");
			}
			if(amAssessmould.getAssessmouldMemo()!=null && amAssessmould.getAssessmouldMemo().length()>0){
				criteria.andAssessmouldMemoLike("%"+amAssessmould.getAssessmouldMemo()+"%");
			}
			if(amAssessmould.getAssessmouldType()!=null){
				if(amAssessmould.getAssessmouldType().getDictId() != null && amAssessmould.getAssessmouldType().getDictId().length()>0)
					criteria.andAssessmouldTypeEqualTo(amAssessmould.getAssessmouldType().getDictId());
			}
	
		}
		
		Page<ErpAmAssessmould> page= (Page<ErpAmAssessmould>)amAssessmouldMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
