package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmLogbook;
import com.junchen.back.pojo.ErpAmLogbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpAmLogbookMapper {
    int countByExample(ErpAmLogbookExample example);

    int deleteByExample(ErpAmLogbookExample example);

    int deleteByPrimaryKey(Long logbookId);

    int insert(ErpAmLogbook record);

    int insertSelective(ErpAmLogbook record);

    List<ErpAmLogbook> selectByExample(ErpAmLogbookExample example);

    ErpAmLogbook selectByPrimaryKey(Long logbookId);

    int updateByExampleSelective(@Param("record") ErpAmLogbook record, @Param("example") ErpAmLogbookExample example);

    int updateByExample(@Param("record") ErpAmLogbook record, @Param("example") ErpAmLogbookExample example);

    int updateByPrimaryKeySelective(ErpAmLogbook record);

    int updateByPrimaryKey(ErpAmLogbook record);

	List<ErpAmLogbook> findStaffList();
}