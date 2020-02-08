package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpSysBasedict;
import com.junchen.back.pojo.ErpSysBasedictExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ErpSysBasedictMapper {
    int countByExample(ErpSysBasedictExample example);

    int deleteByExample(ErpSysBasedictExample example);

    int deleteByPrimaryKey(String dictId);

    int insert(ErpSysBasedict record);

    int insertSelective(ErpSysBasedict record);

    List<ErpSysBasedict> selectByExample(ErpSysBasedictExample example);

    ErpSysBasedict selectByPrimaryKey(String dictId);

    int updateByExampleSelective(@Param("record") ErpSysBasedict record, @Param("example") ErpSysBasedictExample example);

    int updateByExample(@Param("record") ErpSysBasedict record, @Param("example") ErpSysBasedictExample example);

    int updateByPrimaryKeySelective(ErpSysBasedict record);

    int updateByPrimaryKey(ErpSysBasedict record);

	List<ErpSysBasedict> selectByTypeCode(String typeCode);
}