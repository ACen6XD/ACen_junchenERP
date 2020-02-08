package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpAmAssesspoint implements Serializable{
    private Long assesspointId;

    private ErpAmAssessrule assesspointRule;

    private Long assesspointStaffpoint;

    private Long assesspointBosspoint;

    private Long assesspointAssess;

    public Long getAssesspointId() {
        return assesspointId;
    }

    public void setAssesspointId(Long assesspointId) {
        this.assesspointId = assesspointId;
    }

   
    public Long getAssesspointStaffpoint() {
        return assesspointStaffpoint;
    }

    public void setAssesspointStaffpoint(Long assesspointStaffpoint) {
        this.assesspointStaffpoint = assesspointStaffpoint;
    }

    public Long getAssesspointBosspoint() {
        return assesspointBosspoint;
    }

    public void setAssesspointBosspoint(Long assesspointBosspoint) {
        this.assesspointBosspoint = assesspointBosspoint;
    }

	public ErpAmAssessrule getAssesspointRule() {
		return assesspointRule;
	}

	public void setAssesspointRule(ErpAmAssessrule assesspointRule) {
		this.assesspointRule = assesspointRule;
	}

	public Long getAssesspointAssess() {
		return assesspointAssess;
	}

	public void setAssesspointAssess(Long assesspointAssess) {
		this.assesspointAssess = assesspointAssess;
	}

	
   
}