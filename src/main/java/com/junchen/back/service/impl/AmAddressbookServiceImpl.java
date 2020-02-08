package com.junchen.back.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpAmAddressbookMapper;
import com.junchen.back.pojo.ErpAmAddressbook;
import com.junchen.back.pojo.ErpAmAddressbookExample;
import com.junchen.back.pojo.ErpAmAddressbookExample.Criteria;
import com.junchen.back.service.AmAddressbookService;
import com.junchen.back.myentity.PageResult;

/**
 * amAddressbook服务实现层
 * @author Administrator
 *
 */
@Service
public class AmAddressbookServiceImpl implements AmAddressbookService {

	@Autowired
	private ErpAmAddressbookMapper amAddressbookMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpAmAddressbook> findAll() {
		return amAddressbookMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpAmAddressbook> page=   (Page<ErpAmAddressbook>) amAddressbookMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpAmAddressbook amAddressbook) {
		amAddressbookMapper.insert(amAddressbook);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpAmAddressbook amAddressbook){
		amAddressbookMapper.updateByPrimaryKey(amAddressbook);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpAmAddressbook findOne(Long id){
		return amAddressbookMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			amAddressbookMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpAmAddressbook amAddressbook, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpAmAddressbookExample example=new ErpAmAddressbookExample();
		Criteria criteria = example.createCriteria();
		
		if(amAddressbook!=null){			
						if(amAddressbook.getAddressbookName()!=null && amAddressbook.getAddressbookName().length()>0){
				criteria.andAddressbookNameLike("%"+amAddressbook.getAddressbookName()+"%");
			}
			if(amAddressbook.getAddressbookGender()!=null && amAddressbook.getAddressbookGender().length()>0){
				criteria.andAddressbookGenderLike("%"+amAddressbook.getAddressbookGender()+"%");
			}
			if(amAddressbook.getAddressbookQq()!=null && amAddressbook.getAddressbookQq().length()>0){
				criteria.andAddressbookQqLike("%"+amAddressbook.getAddressbookQq()+"%");
			}
			if(amAddressbook.getAddressbookTelephone()!=null && amAddressbook.getAddressbookTelephone().length()>0){
				criteria.andAddressbookTelephoneLike("%"+amAddressbook.getAddressbookTelephone()+"%");
			}
			if(amAddressbook.getAddressbookPhone()!=null && amAddressbook.getAddressbookPhone().length()>0){
				criteria.andAddressbookPhoneLike("%"+amAddressbook.getAddressbookPhone()+"%");
			}
			if(amAddressbook.getAddressbookWechat()!=null && amAddressbook.getAddressbookWechat().length()>0){
				criteria.andAddressbookWechatLike("%"+amAddressbook.getAddressbookWechat()+"%");
			}
			if(amAddressbook.getAddressbookFax()!=null && amAddressbook.getAddressbookFax().length()>0){
				criteria.andAddressbookFaxLike("%"+amAddressbook.getAddressbookFax()+"%");
			}
			if(amAddressbook.getAddressbookEmail()!=null && amAddressbook.getAddressbookEmail().length()>0){
				criteria.andAddressbookEmailLike("%"+amAddressbook.getAddressbookEmail()+"%");
			}
			if(amAddressbook.getAddressbookCompanyname()!=null && amAddressbook.getAddressbookCompanyname().length()>0){
				criteria.andAddressbookCompanynameLike("%"+amAddressbook.getAddressbookCompanyname()+"%");
			}
			if(amAddressbook.getAddressbookCompanyphone()!=null && amAddressbook.getAddressbookCompanyphone().length()>0){
				criteria.andAddressbookCompanyphoneLike("%"+amAddressbook.getAddressbookCompanyphone()+"%");
			}
			if(amAddressbook.getAddressbookCompanyaddress()!=null && amAddressbook.getAddressbookCompanyaddress().length()>0){
				criteria.andAddressbookCompanyaddressLike("%"+amAddressbook.getAddressbookCompanyaddress()+"%");
			}
			if(amAddressbook.getAddressbookCompanyweb()!=null && amAddressbook.getAddressbookCompanyweb().length()>0){
				criteria.andAddressbookCompanywebLike("%"+amAddressbook.getAddressbookCompanyweb()+"%");
			}
			if(amAddressbook.getAddressbookMemo()!=null && amAddressbook.getAddressbookMemo().length()>0){
				criteria.andAddressbookMemoLike("%"+amAddressbook.getAddressbookMemo()+"%");
			}
			if(amAddressbook.getAddressbookEnable()!=null && amAddressbook.getAddressbookEnable().length()>0){
				criteria.andAddressbookEnableLike("%"+amAddressbook.getAddressbookEnable()+"%");
			}
			if(amAddressbook.getAddressbookJob()!=null && amAddressbook.getAddressbookJob().length()>0){
				criteria.andAddressbookJobLike("%"+amAddressbook.getAddressbookJob()+"%");
			}
	
		}
		
		Page<ErpAmAddressbook> page= (Page<ErpAmAddressbook>)amAddressbookMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<String> findCompany() {
			return amAddressbookMapper.findCompany();
		}
	
}
