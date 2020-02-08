package com.junchen.back.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.junchen.back.mapper.ErpSysBasedictMapper;
import com.junchen.back.pojo.ErpSysBasedict;
import com.junchen.back.pojo.ErpSysBasedictExample;
import com.junchen.back.pojo.ErpSysBasedictExample.Criteria;
import com.junchen.back.service.SysBasedictService;
import com.junchen.back.myentity.PageResult;

/**
 * sysBasedict服务实现层
 * @author Administrator
 *
 */
@Service
public class SysBasedictServiceImpl implements SysBasedictService {

	@Autowired
	private ErpSysBasedictMapper sysBasedictMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<ErpSysBasedict> findAll() {
		return sysBasedictMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<ErpSysBasedict> page=   (Page<ErpSysBasedict>) sysBasedictMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(ErpSysBasedict sysBasedict) {
		sysBasedictMapper.insert(sysBasedict);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(ErpSysBasedict sysBasedict){
		sysBasedictMapper.updateByPrimaryKey(sysBasedict);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public ErpSysBasedict findOne(String id){
		return sysBasedictMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			sysBasedictMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(ErpSysBasedict sysBasedict, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ErpSysBasedictExample example=new ErpSysBasedictExample();
		Criteria criteria = example.createCriteria();
		
		if(sysBasedict!=null){			
						if(sysBasedict.getDictId()!=null && sysBasedict.getDictId().length()>0){
				criteria.andDictIdLike("%"+sysBasedict.getDictId()+"%");
			}
			if(sysBasedict.getDictTypeCode()!=null && sysBasedict.getDictTypeCode().length()>0){
				criteria.andDictTypeCodeLike("%"+sysBasedict.getDictTypeCode()+"%");
			}
			if(sysBasedict.getDictTypeName()!=null && sysBasedict.getDictTypeName().length()>0){
				criteria.andDictTypeNameLike("%"+sysBasedict.getDictTypeName()+"%");
			}
			if(sysBasedict.getDictItemCode()!=null && sysBasedict.getDictItemCode().length()>0){
				criteria.andDictItemCodeLike("%"+sysBasedict.getDictItemCode()+"%");
			}
			if(sysBasedict.getDictItemName()!=null && sysBasedict.getDictItemName().length()>0){
				criteria.andDictItemNameLike("%"+sysBasedict.getDictItemName()+"%");
			}
			if(sysBasedict.getDictMemo()!=null && sysBasedict.getDictMemo().length()>0){
				criteria.andDictMemoLike("%"+sysBasedict.getDictMemo()+"%");
			}
			if(sysBasedict.getDictEnable()!=null && sysBasedict.getDictEnable().length()>0){
				criteria.andDictEnableLike("%"+sysBasedict.getDictEnable()+"%");
			}
	
		}
		
		Page<ErpSysBasedict> page= (Page<ErpSysBasedict>)sysBasedictMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<ErpSysBasedict> findDict(String typeCode) {
			return sysBasedictMapper.selectByTypeCode(typeCode);
		}
	
}
