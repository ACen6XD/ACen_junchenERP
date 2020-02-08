package com.junchen.back.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.junchen.back.pojo.ErpAmStaff;

public class AmStaffServiceTest extends BaseJunit4Class{
	
	@Autowired
	private AmStaffService amStaffService;
	
	@Test
	public void testFindLoginStaff() {
		ErpAmStaff staff = amStaffService.findLoginStaff(1L);
		if(staff != null)
			System.out.println(staff.toString());
		else
			System.out.println("null");
	}

}
