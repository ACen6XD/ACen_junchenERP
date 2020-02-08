package com.junchen.back.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpFmSalaryruleMapper;
import com.junchen.back.pojo.ErpFmSalaryrule;
import com.junchen.back.pojo.ErpFmSalaryruleExample;
import com.junchen.back.pojo.ErpFmSalaryruleExample.Criteria;
import com.junchen.back.service.FmSalaryruleService;
import com.junchen.back.myentity.PageResult;

/**
 * fmSalaryrule服务实现层
 * @author Administrator
 *
 */
@Service
public class FmSalaryruleServiceImpl implements FmSalaryruleService {

	@Autowired
	private ErpFmSalaryruleMapper fmSalaryruleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpFmSalaryrule> findAll() {
		return fmSalaryruleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpFmSalaryrule> page=   (Page<ErpFmSalaryrule>) fmSalaryruleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpFmSalaryrule fmSalaryrule) {
		fmSalaryruleMapper.insert(fmSalaryrule);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpFmSalaryrule fmSalaryrule){
		fmSalaryruleMapper.updateByPrimaryKey(fmSalaryrule);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpFmSalaryrule findOne(Long id){
		return fmSalaryruleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			fmSalaryruleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpFmSalaryrule fmSalaryrule, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpFmSalaryruleExample example=new ErpFmSalaryruleExample();
		Criteria criteria = example.createCriteria();
		
		if(fmSalaryrule!=null){			
						if(fmSalaryrule.getSalaryruleStaffname()!=null && fmSalaryrule.getSalaryruleStaffname().length()>0){
				criteria.andSalaryruleStaffnameLike("%"+fmSalaryrule.getSalaryruleStaffname()+"%");
			}
			if(fmSalaryrule.getSalaryruleStaffdep()!=null && fmSalaryrule.getSalaryruleStaffdep().length()>0){
				criteria.andSalaryruleStaffdepLike("%"+fmSalaryrule.getSalaryruleStaffdep()+"%");
			}
			if(fmSalaryrule.getSalaryruleMemo()!=null && fmSalaryrule.getSalaryruleMemo().length()>0){
				criteria.andSalaryruleMemoLike("%"+fmSalaryrule.getSalaryruleMemo()+"%");
			}
	
		}
		
		Page<ErpFmSalaryrule> page= (Page<ErpFmSalaryrule>)fmSalaryruleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<ErpFmSalaryrule> findSalaryRules(
				ErpFmSalaryrule searchEntity, List<ErpFmSalaryrule> rulesList) {
//			//建立搜索条件
//			ErpFmSalaryruleExample example=new ErpFmSalaryruleExample();
//			Criteria criteria = example.createCriteria();
//			if(searchEntity.getSalaryruleStaffname()!=null && searchEntity.getSalaryruleStaffname().trim().length()>0){
//				criteria.andSalaryruleStaffnameLike("%"+searchEntity.getSalaryruleStaffname()+"%");
//			}
//			if(searchEntity.getSalaryruleStaffdep()!=null&&searchEntity.getSalaryruleStaffdep().length()>0){
//				criteria.andSalaryruleStaffdepEqualTo(searchEntity.getSalaryruleStaffdep());
//			}
//			//查找出符合要求的数据列表
//			List<ErpFmSalaryrule> list = fmSalaryruleMapper.selectByExample(example);
//			if(list.size() > 0){//如果有查找的数据
//				int i = 0;
//				for (ErpFmSalaryrule newRule : list) {
//					System.out.println(newRule.toString());
//					for(ErpFmSalaryrule oldRule : rulesList){
//						if(newRule.getSalaryruleId() == oldRule.getSalaryruleId()){
//							rulesList.add(i, oldRule);
//							rulesList.remove(rulesList.lastIndexOf(oldRule));
//							i++;
//						}
//					}
//				}
//			}
			int i = 0;
			if(searchEntity.getSalaryruleStaffname()!=null && searchEntity.getSalaryruleStaffname().trim().length()>0){//如果按姓名查询
				if(searchEntity.getSalaryruleStaffdep()!=null&&searchEntity.getSalaryruleStaffdep().length()>0){//同时也按照部门查询
					for(ErpFmSalaryrule oldRule : rulesList){
						if(oldRule.getSalaryruleStaffname().contains(searchEntity.getSalaryruleStaffname()) && oldRule.getSalaryruleStaffdep().equals(searchEntity.getSalaryruleStaffdep())){
							ErpFmSalaryrule temp = oldRule;
							rulesList.set(rulesList.indexOf(oldRule), rulesList.get(i));
							rulesList.set(i, temp);
							i++;
						}
					}
				}else{
					for(ErpFmSalaryrule oldRule : rulesList){
						if(oldRule.getSalaryruleStaffname().contains(searchEntity.getSalaryruleStaffname())){
							ErpFmSalaryrule temp = oldRule;
							rulesList.set(rulesList.indexOf(oldRule), rulesList.get(i));
							rulesList.set(i, temp);
							i++;
						}						
					}
				}
			}
			else {
			if(searchEntity.getSalaryruleStaffdep()!=null&&searchEntity.getSalaryruleStaffdep().length()>0){
				
					for(ErpFmSalaryrule oldRule : rulesList){
						if(oldRule.getSalaryruleStaffdep().equals(searchEntity.getSalaryruleStaffdep())){
							ErpFmSalaryrule temp = oldRule;
							rulesList.set(rulesList.indexOf(oldRule), rulesList.get(i));
							rulesList.set(i, temp);
							i++;
						}													
					}
				}
			}
				
				
			return rulesList;
		}

}
