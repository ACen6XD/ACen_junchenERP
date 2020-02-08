package com.junchen.back.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.junchen.back.pojo.ErpAmAddressbook;

public class AmAddressbookServiceTest extends BaseJunit4Class{
	
	@Autowired
	private AmAddressbookService amAddressbookService;
	
	@Test
	public void testFindAll() {
		List<ErpAmAddressbook> list = amAddressbookService.findAll();
		for (ErpAmAddressbook erpAmAddressbook : list) {
			System.out.println(erpAmAddressbook.toString());
		}
	}

}
