package com.junchen.back.pojogroup;

import java.io.Serializable;
import java.util.List;

import com.junchen.back.pojo.ErpFmSalary;
import com.junchen.back.pojo.ErpFmSalaryrule;

/**
 * 薪资记录
 * @author 岑洛彬
 *
 */
public class Salary implements Serializable{
	private ErpFmSalary salary;
	private List<ErpFmSalaryrule> salaryRules;
	public ErpFmSalary getSalary() {
		return salary;
	}
	public void setSalary(ErpFmSalary salary) {
		this.salary = salary;
	}
	public List<ErpFmSalaryrule> getSalaryRules() {
		return salaryRules;
	}
	public void setSalaryRules(List<ErpFmSalaryrule> salaryRules) {
		this.salaryRules = salaryRules;
	}
	
}
