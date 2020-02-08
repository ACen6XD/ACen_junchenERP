package com.junchen.back.pojogroup;

import java.io.Serializable;
import java.util.List;

import com.junchen.back.pojo.ErpFmSalaryrule;

/**
 * 用于在新增薪资记录时候查找薪资细则
 * @author 岑洛彬
 *
 */
public class SalaryRule implements Serializable{
	private ErpFmSalaryrule rule;
	private List<ErpFmSalaryrule> rulesList;
	public ErpFmSalaryrule getRule() {
		return rule;
	}
	public void setRule(ErpFmSalaryrule rule) {
		this.rule = rule;
	}
	public List<ErpFmSalaryrule> getRulesList() {
		return rulesList;
	}
	public void setRulesList(List<ErpFmSalaryrule> rulesList) {
		this.rulesList = rulesList;
	}
	
	
}
