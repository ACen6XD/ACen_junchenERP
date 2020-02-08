package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpAmAssess implements Serializable{
    private Long assessId;

    private ErpAmAssessmould assessMould;

    private String assessName;

    private ErpAmStaff assessStaff;

    private String assessStaffdate;

    private ErpAmStaff assessBoss;

    private String assessBossdate;

    private Long assessStaffpoints;

    private Long assessBosspoints;

    private String assessEnable;

    private String assessSummary;

    public Long getAssessId() {
        return assessId;
    }

    public void setAssessId(Long assessId) {
        this.assessId = assessId;
    }

   

    public String getAssessName() {
        return assessName;
    }

    public void setAssessName(String assessName) {
        this.assessName = assessName == null ? null : assessName.trim();
    }

    public ErpAmAssessmould getAssessMould() {
		return assessMould;
	}

	public void setAssessMould(ErpAmAssessmould assessMould) {
		this.assessMould = assessMould;
	}

	public ErpAmStaff getAssessStaff() {
		return assessStaff;
	}

	public void setAssessStaff(ErpAmStaff assessStaff) {
		this.assessStaff = assessStaff;
	}

	public ErpAmStaff getAssessBoss() {
		return assessBoss;
	}

	public void setAssessBoss(ErpAmStaff assessBoss) {
		this.assessBoss = assessBoss;
	}

	public String getAssessStaffdate() {
        return assessStaffdate;
    }

    public void setAssessStaffdate(String assessStaffdate) {
        this.assessStaffdate = assessStaffdate == null ? null : assessStaffdate.trim();
    }

   
    public String getAssessBossdate() {
        return assessBossdate;
    }

    public void setAssessBossdate(String assessBossdate) {
        this.assessBossdate = assessBossdate == null ? null : assessBossdate.trim();
    }

    public Long getAssessStaffpoints() {
        return assessStaffpoints;
    }

    public void setAssessStaffpoints(Long assessStaffpoints) {
        this.assessStaffpoints = assessStaffpoints;
    }

    public Long getAssessBosspoints() {
        return assessBosspoints;
    }

    public void setAssessBosspoints(Long assessBosspoints) {
        this.assessBosspoints = assessBosspoints;
    }

    public String getAssessEnable() {
        return assessEnable;
    }

    public void setAssessEnable(String assessEnable) {
        this.assessEnable = assessEnable == null ? null : assessEnable.trim();
    }

    public String getAssessSummary() {
        return assessSummary;
    }

    public void setAssessSummary(String assessSummary) {
        this.assessSummary = assessSummary == null ? null : assessSummary.trim();
    }
}