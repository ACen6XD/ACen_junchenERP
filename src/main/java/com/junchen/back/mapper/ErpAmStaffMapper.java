package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmStaff;
import com.junchen.back.pojo.ErpAmStaffExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ErpAmStaffMapper{
    int countByExample(ErpAmStaffExample example);

    int deleteByExample(ErpAmStaffExample example);

    int deleteByPrimaryKey(Long staffId);

    int insert(ErpAmStaff record);

    int insertSelective(ErpAmStaff record);

    List<ErpAmStaff> selectByExample(ErpAmStaffExample example);

    ErpAmStaff selectByPrimaryKey(Long staffId);

    int updateByExampleSelective(@Param("record") ErpAmStaff record, @Param("example") ErpAmStaffExample example);

    int updateByExample(@Param("record") ErpAmStaff record, @Param("example") ErpAmStaffExample example);

    int updateByPrimaryKeySelective(ErpAmStaff record);

    int updateByPrimaryKey(ErpAmStaff record);

	ErpAmStaff findLoginStaff(Long loginUserId);

	List<ErpAmStaff> findQuitList();

}