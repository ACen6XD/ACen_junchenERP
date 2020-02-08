package com.junchen.back.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmStaffMapper;
import com.junchen.back.pojo.ErpAmStaff;
import com.junchen.back.pojo.ErpAmStaffExample;
import com.junchen.back.pojo.ErpAmStaffExample.Criteria;
import com.junchen.back.service.AmStaffService;
import com.junchen.back.myentity.PageResult;

/**
 * amStaff服务实现层
 * @author Administrator
 *
 */
@Service
public class AmStaffServiceImpl implements AmStaffService {

	@Autowired
	private ErpAmStaffMapper amStaffMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmStaff> findAll() {
		return amStaffMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmStaff> page=   (Page<ErpAmStaff>) amStaffMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpAmStaff amStaff) {
		amStaffMapper.insert(amStaff);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpAmStaff amStaff){
		amStaffMapper.updateByPrimaryKey(amStaff);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpAmStaff findOne(Long id){
		return amStaffMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amStaffMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmStaff amStaff, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmStaffExample example=new ErpAmStaffExample();
		Criteria criteria = example.createCriteria();
		
		if(amStaff!=null){			
						if(amStaff.getStaffName()!=null && amStaff.getStaffName().length()>0){
				criteria.andStaffNameLike("%"+amStaff.getStaffName()+"%");
			}
			if(amStaff.getStaffGender()!=null && amStaff.getStaffGender().length()>0){
				criteria.andStaffGenderLike("%"+amStaff.getStaffGender()+"%");
			}
			if(amStaff.getStaffCardid()!=null && amStaff.getStaffCardid().length()>0){
				criteria.andStaffCardidLike("%"+amStaff.getStaffCardid()+"%");
			}
			if(amStaff.getStaffPhone()!=null && amStaff.getStaffPhone().length()>0){
				criteria.andStaffPhoneLike("%"+amStaff.getStaffPhone()+"%");
			}
			if(amStaff.getStaffAddress()!=null && amStaff.getStaffAddress().length()>0){
				criteria.andStaffAddressLike("%"+amStaff.getStaffAddress()+"%");
			}
			if(amStaff.getStaffType()!=null)
				if(amStaff.getStaffType().getDictId() != null && amStaff.getStaffType().getDictId().length()>0){
				criteria.andStaffTypeLike("%"+amStaff.getStaffType().getDictId()+"%");
			}
			if(amStaff.getStaffDepartment()!= null )
				if(amStaff.getStaffDepartment().getDictId() != null && amStaff.getStaffDepartment().getDictId().length()>0){
				criteria.andStaffDepartmentLike("%"+amStaff.getStaffDepartment().getDictId()+"%");
			}
			if(amStaff.getStaffTitles()!=null )
				if(amStaff.getStaffTitles().getDictId() != null && amStaff.getStaffTitles().getDictId().length()>0){
				criteria.andStaffTitlesLike("%"+amStaff.getStaffTitles().getDictId()+"%");
			}
			if(amStaff.getStaffPhoto()!=null && amStaff.getStaffPhoto().length()>0){
				criteria.andStaffPhotoLike("%"+amStaff.getStaffPhoto()+"%");
			}
			if(amStaff.getStaffContract()!=null && amStaff.getStaffContract().length()>0){
				criteria.andStaffContractLike("%"+amStaff.getStaffContract()+"%");
			}
			if(amStaff.getStaffEducation()!=null){
				if(amStaff.getStaffEducation().getDictId() != null && !"".equals(amStaff.getStaffEducation().getDictId())){
					criteria.andStaffEducationLike("%"+amStaff.getStaffEducation().getDictId()+"%");					
				}
			}
			if(amStaff.getStaffHealth()!=null && amStaff.getStaffHealth().length()>0){
				criteria.andStaffHealthLike("%"+amStaff.getStaffHealth()+"%");
			}
			if(amStaff.getStaffEnable()!=null && amStaff.getStaffEnable().length()>0){
				criteria.andStaffEnableLike("%"+amStaff.getStaffEnable()+"%");
			}
			if(amStaff.getStaffIndate()!=null&&amStaff.getStaffIndate().length()>0){
				criteria.andStaffIndateLike("%"+ amStaff.getStaffIndate() +"%");
			}
			if(amStaff.getStaffEnable() != null && amStaff.getStaffEnable().length() > 0){
				criteria.andStaffEnableEqualTo(amStaff.getStaffEnable());
			}
	
		}
		
		Page<ErpAmStaff> page= (Page<ErpAmStaff>)amStaffMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public ErpAmStaff findLoginStaff(Long loginUserId) {
	
			return  amStaffMapper.findLoginStaff(loginUserId);
		}

		@Override
		public List<ErpAmStaff> findQuitList() {
			return amStaffMapper.findQuitList();
		}
	
}
