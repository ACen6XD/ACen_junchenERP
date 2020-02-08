package com.junchen.back.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmAssessMapper;
import com.junchen.back.mapper.ErpAmAssessmouldMapper;
import com.junchen.back.mapper.ErpAmAssesspointMapper;
import com.junchen.back.pojo.ErpAmAssess;
import com.junchen.back.pojo.ErpAmAssessExample;
import com.junchen.back.pojo.ErpAmAssessExample.Criteria;
import com.junchen.back.pojo.ErpAmAssessmould;
import com.junchen.back.pojo.ErpAmAssessmouldExample;
import com.junchen.back.pojo.ErpAmAssesspoint;
import com.junchen.back.pojo.ErpAmAssesspointExample;
import com.junchen.back.pojogroup.Assess;
import com.junchen.back.service.AmAssessService;
import com.junchen.back.myentity.PageResult;

/**
 * amAssess服务实现层
 * @author Administrator
 *
 */
@Service
public class AmAssessServiceImpl implements AmAssessService {

	@Autowired
	private ErpAmAssessMapper amAssessMapper;
	@Autowired
	private ErpAmAssesspointMapper amAssesspointMapper;
	@Autowired
	private ErpAmAssessmouldMapper amAssessmouldMapper;
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmAssess> findAll() {
		return amAssessMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmAssess> page=   (Page<ErpAmAssess>) amAssessMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Assess amAssess) {
		ErpAmAssess aeesee = amAssess.getAssess();//获取到要添加的考核基本信息
		amAssessMapper.insert(aeesee);
		for (ErpAmAssesspoint point : amAssess.getAssessPoints()) {//获取到要添加的考核细则信息以及评分
			point.setAssesspointAssess(aeesee.getAssessId());//设置细则评分所属的考核记录编号
			amAssesspointMapper.insert(point);
		}
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Assess amAssess){
		amAssessMapper.updateByPrimaryKey(amAssess.getAssess());
		for(ErpAmAssesspoint point:amAssess.getAssessPoints()){
			point.setAssesspointAssess(amAssess.getAssess().getAssessId());//设置细则评分所属的考核记录编号
			amAssesspointMapper.updateByPrimaryKey(point);
		}
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Assess findOne(Long id){
		Assess assess = new Assess();
		ErpAmAssess amAssess = amAssessMapper.selectByPrimaryKey(id);
		assess.setAssess(amAssess);
		ErpAmAssesspointExample example = new ErpAmAssesspointExample();
		com.junchen.back.pojo.ErpAmAssesspointExample.Criteria criteria = example.createCriteria();
		criteria.andAssesspointAssessEqualTo(id);
		assess.setAssessPoints(amAssesspointMapper.selectByExample(example ));
		return assess;
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amAssessMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmAssess amAssess, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmAssessExample example=new ErpAmAssessExample();
		Criteria criteria = example.createCriteria();
		
		if(amAssess!=null){			
			if(amAssess.getAssessName()!=null && amAssess.getAssessName().length()>0){
				criteria.andAssessNameLike("%"+amAssess.getAssessName()+"%");
			}
		
			if(amAssess.getAssessEnable()!=null && amAssess.getAssessEnable().length()>0){
				criteria.andAssessEnableLike("%"+amAssess.getAssessEnable()+"%");
			}
			if(amAssess.getAssessMould()!=null){
				
					criteria.andAssessMouldEqualTo(amAssess.getAssessMould().getAssessmouldId());					
				
			}

		}
		
		Page<ErpAmAssess> page= (Page<ErpAmAssess>)amAssessMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
