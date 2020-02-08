package com.junchen.back.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpFmSalaryMapper;
import com.junchen.back.mapper.ErpFmSalaryruleMapper;
import com.junchen.back.pojo.ErpFmSalary;
import com.junchen.back.pojo.ErpFmSalaryExample;
import com.junchen.back.pojo.ErpFmSalaryExample.Criteria;
import com.junchen.back.pojo.ErpFmSalaryrule;
import com.junchen.back.pojo.ErpFmSalaryruleExample;
import com.junchen.back.pojogroup.Salary;
import com.junchen.back.service.FmSalaryService;
import com.junchen.back.myentity.PageResult;

/**
 * fmSalary服务实现层
 * @author Administrator
 *
 */
@Service
public class FmSalaryServiceImpl implements FmSalaryService {

	@Autowired
	private ErpFmSalaryMapper fmSalaryMapper;
	@Autowired
	private ErpFmSalaryruleMapper fmSalaryruleMapper;
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpFmSalary> findAll() {
		return fmSalaryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpFmSalary> page=   (Page<ErpFmSalary>) fmSalaryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Salary fmSalary) {
		ErpFmSalary salary = fmSalary.getSalary();
		fmSalaryMapper.insert(salary);
		for(ErpFmSalaryrule rule:fmSalary.getSalaryRules()){
			rule.setSalaryruleSalary(salary.getSalaryId());
			fmSalaryruleMapper.insert(rule);
		}
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Salary fmSalary){
		fmSalaryMapper.updateByPrimaryKey(fmSalary.getSalary());
		for(ErpFmSalaryrule rule:fmSalary.getSalaryRules()){
			rule.setSalaryruleSalary(fmSalary.getSalary().getSalaryId());
			fmSalaryruleMapper.updateByPrimaryKey(rule);
		}
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Salary findOne(Long id){
		Salary salary = new Salary();
		salary.setSalary(fmSalaryMapper.selectByPrimaryKey(id));
		ErpFmSalaryruleExample example = new ErpFmSalaryruleExample();
		com.junchen.back.pojo.ErpFmSalaryruleExample.Criteria criteria = example.createCriteria();
		criteria.andSalaryruleSalaryEqualTo(id);
		List<ErpFmSalaryrule> list = fmSalaryruleMapper.selectByExample(example);
		salary.setSalaryRules(list);
		return salary;
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			fmSalaryMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpFmSalary fmSalary, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpFmSalaryExample example=new ErpFmSalaryExample();
		Criteria criteria = example.createCriteria();
		
		if(fmSalary!=null){			
						if(fmSalary.getSalaryName()!=null && fmSalary.getSalaryName().length()>0){
				criteria.andSalaryNameLike("%"+fmSalary.getSalaryName()+"%");
			}
			if(fmSalary.getSalaryDate()!=null && fmSalary.getSalaryDate().length()>0){
				criteria.andSalaryDateLike("%"+fmSalary.getSalaryDate()+"%");
			}
			if(fmSalary.getSalaryMemo()!=null && fmSalary.getSalaryMemo().length()>0){
				criteria.andSalaryMemoLike("%"+fmSalary.getSalaryMemo()+"%");
			}
			if(fmSalary.getSalaryEnable()!=null && fmSalary.getSalaryEnable().length()>0){
				criteria.andSalaryEnableLike("%"+fmSalary.getSalaryEnable()+"%");
			}
			if(fmSalary.getSalaryBossdate()!=null && fmSalary.getSalaryBossdate().length()>0){
				criteria.andSalaryBossdateLike("%"+fmSalary.getSalaryBossdate()+"%");
			}
			if(fmSalary.getSalaryBossmemo()!=null && fmSalary.getSalaryBossmemo().length()>0){
				criteria.andSalaryBossmemoLike("%"+fmSalary.getSalaryBossmemo()+"%");
			}
	
		}
		
		Page<ErpFmSalary> page= (Page<ErpFmSalary>)fmSalaryMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<ErpFmSalary> findStaffList() {
			
			return fmSalaryMapper.findStaffList();
		}
	
}
