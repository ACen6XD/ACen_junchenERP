package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmAssessmould;
import com.junchen.back.pojo.ErpAmAssessmouldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpAmAssessmouldMapper {
    int countByExample(ErpAmAssessmouldExample example);

    int deleteByExample(ErpAmAssessmouldExample example);

    int deleteByPrimaryKey(Long assessmouldId);

    int insert(ErpAmAssessmould record);

    int insertSelective(ErpAmAssessmould record);

    List<ErpAmAssessmould> selectByExample(ErpAmAssessmouldExample example);

    ErpAmAssessmould selectByPrimaryKey(Long assessmouldId);

    int updateByExampleSelective(@Param("record") ErpAmAssessmould record, @Param("example") ErpAmAssessmouldExample example);

    int updateByExample(@Param("record") ErpAmAssessmould record, @Param("example") ErpAmAssessmouldExample example);

    int updateByPrimaryKeySelective(ErpAmAssessmould record);

    int updateByPrimaryKey(ErpAmAssessmould record);
}