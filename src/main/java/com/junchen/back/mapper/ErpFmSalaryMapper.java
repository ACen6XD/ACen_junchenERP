package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpFmSalary;
import com.junchen.back.pojo.ErpFmSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpFmSalaryMapper {
    int countByExample(ErpFmSalaryExample example);

    int deleteByExample(ErpFmSalaryExample example);

    int deleteByPrimaryKey(Long salaryId);

    int insert(ErpFmSalary record);

    int insertSelective(ErpFmSalary record);

    List<ErpFmSalary> selectByExample(ErpFmSalaryExample example);

    ErpFmSalary selectByPrimaryKey(Long salaryId);

    int updateByExampleSelective(@Param("record") ErpFmSalary record, @Param("example") ErpFmSalaryExample example);

    int updateByExample(@Param("record") ErpFmSalary record, @Param("example") ErpFmSalaryExample example);

    int updateByPrimaryKeySelective(ErpFmSalary record);

    int updateByPrimaryKey(ErpFmSalary record);

	List<ErpFmSalary> findStaffList();
}