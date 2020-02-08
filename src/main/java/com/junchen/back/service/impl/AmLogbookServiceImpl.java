package com.junchen.back.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmLogbookMapper;
import com.junchen.back.pojo.ErpAmLogbook;
import com.junchen.back.pojo.ErpAmLogbookExample;
import com.junchen.back.pojo.ErpAmLogbookExample.Criteria;
import com.junchen.back.service.AmLogbookService;

import com.junchen.back.myentity.PageResult;

/**
 * amLogbook服务实现层
 * @author Administrator
 *
 */
@Service
public class AmLogbookServiceImpl implements AmLogbookService {

	@Autowired
	private ErpAmLogbookMapper amLogbookMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmLogbook> findAll() {
		return amLogbookMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmLogbook> page=   (Page<ErpAmLogbook>) amLogbookMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpAmLogbook amLogbook) {
		amLogbookMapper.insert(amLogbook);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpAmLogbook amLogbook){
		amLogbookMapper.updateByPrimaryKey(amLogbook);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpAmLogbook findOne(Long id){
		return amLogbookMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amLogbookMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmLogbook amLogbook, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmLogbookExample example=new ErpAmLogbookExample();
		Criteria criteria = example.createCriteria();
		
		if(amLogbook!=null){			
		
			if(amLogbook.getLogbookDate()!=null && amLogbook.getLogbookDate().length()>0){
				criteria.andLogbookDateEqualTo(amLogbook.getLogbookDate());
			}
	
			if(amLogbook.getLogbookEnable()!=null && amLogbook.getLogbookEnable().length()>0){
				criteria.andLogbookEnableEqualTo(amLogbook.getLogbookEnable());
			}
			if(amLogbook.getLogbookStaff()!=null){
				if(amLogbook.getLogbookStaff().getStaffId()!=null && amLogbook.getLogbookStaff().getStaffId()!=0){
					criteria.andLogbookStaffEqualTo(amLogbook.getLogbookStaff().getStaffId());
				}
			}
		}
		
		Page<ErpAmLogbook> page= (Page<ErpAmLogbook>)amLogbookMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<ErpAmLogbook> findStaffList() {
			return amLogbookMapper.findStaffList();
		}
	
}
