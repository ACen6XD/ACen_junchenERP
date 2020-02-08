package com.junchen.back.service;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.junchen.back.pojo.ErpAmRules;

public class AmRulesServiceTest extends BaseJunit4Class{

	@Autowired
	private AmRulesService ruleService;
	
	@Test
	public void testFindAll() {
		List<ErpAmRules> list = ruleService.findAll();
		for (ErpAmRules erpAmRules : list) {
			System.out.println(erpAmRules.toString());
		}
	}

}
