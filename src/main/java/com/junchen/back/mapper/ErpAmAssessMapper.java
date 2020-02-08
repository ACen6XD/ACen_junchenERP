package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmAssess;
import com.junchen.back.pojo.ErpAmAssessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpAmAssessMapper {
    int countByExample(ErpAmAssessExample example);

    int deleteByExample(ErpAmAssessExample example);

    int deleteByPrimaryKey(Long assessId);

    int insert(ErpAmAssess record);

    int insertSelective(ErpAmAssess record);

    List<ErpAmAssess> selectByExample(ErpAmAssessExample example);

    ErpAmAssess selectByPrimaryKey(Long assessId);

    int updateByExampleSelective(@Param("record") ErpAmAssess record, @Param("example") ErpAmAssessExample example);

    int updateByExample(@Param("record") ErpAmAssess record, @Param("example") ErpAmAssessExample example);

    int updateByPrimaryKeySelective(ErpAmAssess record);

    int updateByPrimaryKey(ErpAmAssess record);
}