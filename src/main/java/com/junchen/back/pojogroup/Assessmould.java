package com.junchen.back.pojogroup;

import java.io.Serializable;
import java.util.List;

import com.junchen.back.pojo.ErpAmAssessmould;
import com.junchen.back.pojo.ErpAmAssessrule;

/**
 * 考核模板组合类，包括考核模板的基本信息和考核细则信息
 * @author 岑洛彬
 *
 */
public class Assessmould implements Serializable{
	private ErpAmAssessmould assessmould;
	
	private List<ErpAmAssessrule> assessmouldRules;

	public ErpAmAssessmould getAssessmould() {
		return assessmould;
	}

	public void setAssessmould(ErpAmAssessmould assessmould) {
		this.assessmould = assessmould;
	}

	public List<ErpAmAssessrule> getAssessmouldRules() {
		return assessmouldRules;
	}

	public void setAssessmouldRules(List<ErpAmAssessrule> assessmouldRules) {
		this.assessmouldRules = assessmouldRules;
	}
	
	
}
