package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpFmSalaryrule;
import com.junchen.back.pojo.ErpFmSalaryruleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpFmSalaryruleMapper {
    int countByExample(ErpFmSalaryruleExample example);

    int deleteByExample(ErpFmSalaryruleExample example);

    int deleteByPrimaryKey(Long salaryruleId);

    int insert(ErpFmSalaryrule record);

    int insertSelective(ErpFmSalaryrule record);

    List<ErpFmSalaryrule> selectByExample(ErpFmSalaryruleExample example);

    ErpFmSalaryrule selectByPrimaryKey(Long salaryruleId);

    int updateByExampleSelective(@Param("record") ErpFmSalaryrule record, @Param("example") ErpFmSalaryruleExample example);

    int updateByExample(@Param("record") ErpFmSalaryrule record, @Param("example") ErpFmSalaryruleExample example);

    int updateByPrimaryKeySelective(ErpFmSalaryrule record);

    int updateByPrimaryKey(ErpFmSalaryrule record);
}