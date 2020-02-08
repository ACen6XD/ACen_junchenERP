package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmAssessrule;
import com.junchen.back.pojo.ErpAmAssessruleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ErpAmAssessruleMapper {
    int countByExample(ErpAmAssessruleExample example);

    int deleteByExample(ErpAmAssessruleExample example);

    int deleteByPrimaryKey(Long assessruleId);

    int insert(ErpAmAssessrule record);

    int insertSelective(ErpAmAssessrule record);

    List<ErpAmAssessrule> selectByExample(ErpAmAssessruleExample example);

    ErpAmAssessrule selectByPrimaryKey(Long assessruleId);

    int updateByExampleSelective(@Param("record") ErpAmAssessrule record, @Param("example") ErpAmAssessruleExample example);

    int updateByExample(@Param("record") ErpAmAssessrule record, @Param("example") ErpAmAssessruleExample example);

    int updateByPrimaryKeySelective(ErpAmAssessrule record);

    int updateByPrimaryKey(ErpAmAssessrule record);

	List<ErpAmAssessrule> selectByMouldId(Long id);
}