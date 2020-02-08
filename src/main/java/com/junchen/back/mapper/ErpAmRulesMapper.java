package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmRules;
import com.junchen.back.pojo.ErpAmRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpAmRulesMapper {
    int countByExample(ErpAmRulesExample example);

    int deleteByExample(ErpAmRulesExample example);

    int deleteByPrimaryKey(Long rulesId);

    int insert(ErpAmRules record);

    int insertSelective(ErpAmRules record);

    List<ErpAmRules> selectByExample(ErpAmRulesExample example);

    ErpAmRules selectByPrimaryKey(Long rulesId);

    int updateByExampleSelective(@Param("record") ErpAmRules record, @Param("example") ErpAmRulesExample example);

    int updateByExample(@Param("record") ErpAmRules record, @Param("example") ErpAmRulesExample example);

    int updateByPrimaryKeySelective(ErpAmRules record);

    int updateByPrimaryKey(ErpAmRules record);
    
    List<ErpAmRules> selectByStaffId();
}