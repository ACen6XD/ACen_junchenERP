package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpAmAssessrule implements Serializable{
    private Integer assessruleId;

    private String assessruleName;

    private Long assessrulePoint;

    private Long assessruleMould;

    public Integer getAssessruleId() {
        return assessruleId;
    }

    public void setAssessruleId(Integer assessruleId) {
        this.assessruleId = assessruleId;
    }

    public String getAssessruleName() {
        return assessruleName;
    }

    public void setAssessruleName(String assessruleName) {
        this.assessruleName = assessruleName == null ? null : assessruleName.trim();
    }

    public Long getAssessrulePoint() {
        return assessrulePoint;
    }

    public void setAssessrulePoint(Long assessrulePoint) {
        this.assessrulePoint = assessrulePoint;
    }

    public Long getAssessruleMould() {
        return assessruleMould;
    }

    public void setAssessruleMould(Long assessruleMould) {
        this.assessruleMould = assessruleMould;
    }
}