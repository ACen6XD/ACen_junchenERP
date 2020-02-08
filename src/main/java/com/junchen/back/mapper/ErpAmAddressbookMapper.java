package com.junchen.back.mapper;

import com.junchen.back.pojo.ErpAmAddressbook;
import com.junchen.back.pojo.ErpAmAddressbookExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ErpAmAddressbookMapper {
    int countByExample(ErpAmAddressbookExample example);

    int deleteByExample(ErpAmAddressbookExample example);

    int deleteByPrimaryKey(Long addressbookId);

    int insert(ErpAmAddressbook record);

    int insertSelective(ErpAmAddressbook record);

    List<ErpAmAddressbook> selectByExample(ErpAmAddressbookExample example);

    ErpAmAddressbook selectByPrimaryKey(Long addressbookId);

    int updateByExampleSelective(@Param("record") ErpAmAddressbook record, @Param("example") ErpAmAddressbookExample example);

    int updateByExample(@Param("record") ErpAmAddressbook record, @Param("example") ErpAmAddressbookExample example);

    int updateByPrimaryKeySelective(ErpAmAddressbook record);

    int updateByPrimaryKey(ErpAmAddressbook record);

	List<String> findCompany();
}