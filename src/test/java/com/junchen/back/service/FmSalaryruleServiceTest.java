package com.junchen.back.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.junchen.back.pojo.ErpFmSalary;
import com.junchen.back.pojo.ErpFmSalaryrule;

public class FmSalaryruleServiceTest extends BaseJunit4Class{
	
	@Autowired
	private FmSalaryruleService service;
	
	@Test
	public void testFindSalaryRules() {
		ErpFmSalaryrule s1 = new ErpFmSalaryrule();
		ErpFmSalaryrule s2 = new ErpFmSalaryrule();
		s2.setSalaryruleStaffname("小岑2");
		s2.setSalaryruleStaffdep("10");
		ErpFmSalaryrule s3 = new ErpFmSalaryrule();
		s3.setSalaryruleStaffname("小岑3");
		s3.setSalaryruleStaffdep("10");
		ErpFmSalaryrule s4 = new ErpFmSalaryrule();
		s4.setSalaryruleStaffname("小岑4");
		s4.setSalaryruleStaffdep("12");
		ErpFmSalaryrule s5 = new ErpFmSalaryrule();
		s5.setSalaryruleStaffname("小岑5");
		s5.setSalaryruleStaffdep("12");
		List<ErpFmSalaryrule> list1 = new ArrayList<ErpFmSalaryrule>();
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		list1.add(0, s5);
		list1.remove(list1.lastIndexOf(s5));
		for (ErpFmSalaryrule erpFmSalaryrule : list1) {
			System.out.print(erpFmSalaryrule.getSalaryruleStaffname());	
		}
		System.out.println("小岑33".contains("小岑"));
		s1.setSalaryruleStaffdep("10");
		s1.setSalaryruleStaffname("2");
		List<ErpFmSalaryrule> list2 = service.findSalaryRules(s1, list1);
		for (ErpFmSalaryrule erpFmSalaryrule : list2) {
			System.out.print(erpFmSalaryrule.getSalaryruleStaffname());
		}
	}


}
