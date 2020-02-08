package com.junchen.back.pojogroup;

import java.io.Serializable;
import java.util.List;

import com.junchen.back.pojo.ErpAmAssess;
import com.junchen.back.pojo.ErpAmAssesspoint;


/**
 * 考核信息组合类 包括一个考核基本信息和一堆考核成绩信息
 * @author 岑洛彬
 *
 */

public class Assess implements Serializable{
	private ErpAmAssess assess ;
	private List<ErpAmAssesspoint> assessPoints;
	public ErpAmAssess getAssess() {
		return assess;
	}
	public void setAssess(ErpAmAssess assess) {
		this.assess = assess;
	}
	public List<ErpAmAssesspoint> getAssessPoints() {
		return assessPoints;
	}
	public void setAssessPoints(List<ErpAmAssesspoint> assessPoints) {
		this.assessPoints = assessPoints;
	}
	
	
}
