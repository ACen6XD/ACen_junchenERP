package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmAssesspoint;
import com.junchen.back.pojo.ErpAmAssesspointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpAmAssesspointMapper {
    int countByExample(ErpAmAssesspointExample example);

    int deleteByExample(ErpAmAssesspointExample example);

    int deleteByPrimaryKey(Long assesspointId);

    int insert(ErpAmAssesspoint record);

    int insertSelective(ErpAmAssesspoint record);

    List<ErpAmAssesspoint> selectByExample(ErpAmAssesspointExample example);

    ErpAmAssesspoint selectByPrimaryKey(Long assesspointId);

    int updateByExampleSelective(@Param("record") ErpAmAssesspoint record, @Param("example") ErpAmAssesspointExample example);

    int updateByExample(@Param("record") ErpAmAssesspoint record, @Param("example") ErpAmAssesspointExample example);

    int updateByPrimaryKeySelective(ErpAmAssesspoint record);

    int updateByPrimaryKey(ErpAmAssesspoint record);
}