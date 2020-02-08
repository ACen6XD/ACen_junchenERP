package com.junchen.back.pojo;

import java.io.Serializable;
import java.util.List;

public class ErpAmAssessmould implements Serializable{
    private Long assessmouldId;

    private String assessmouldName;

    private ErpAmStaff assessmouldStaff;

    private String assessmouldMakedate;

    private String assessmouldEnable;

    private String assessmouldMemo;

    private Long assessmouldTotal;
    
    private ErpSysBasedict assessmouldType;

	public Long getAssessmouldId() {
        return assessmouldId;
    }

    public void setAssessmouldId(Long assessmouldId) {
        this.assessmouldId = assessmouldId;
    }

    public String getAssessmouldName() {
        return assessmouldName;
    }

    public void setAssessmouldName(String assessmouldName) {
        this.assessmouldName = assessmouldName == null ? null : assessmouldName.trim();
    }


    public String getAssessmouldMakedate() {
        return assessmouldMakedate;
    }

    public void setAssessmouldMakedate(String assessmouldMakedate) {
        this.assessmouldMakedate = assessmouldMakedate == null ? null : assessmouldMakedate.trim();
    }

    public String getAssessmouldEnable() {
        return assessmouldEnable;
    }

    public void setAssessmouldEnable(String assessmouldEnable) {
        this.assessmouldEnable = assessmouldEnable == null ? null : assessmouldEnable.trim();
    }

    public String getAssessmouldMemo() {
        return assessmouldMemo;
    }

    public void setAssessmouldMemo(String assessmouldMemo) {
        this.assessmouldMemo = assessmouldMemo == null ? null : assessmouldMemo.trim();
    }

    public Long getAssessmouldTotal() {
        return assessmouldTotal;
    }

    public void setAssessmouldTotal(Long assessmouldTotal) {
        this.assessmouldTotal = assessmouldTotal;
    }

	public ErpAmStaff getAssessmouldStaff() {
		return assessmouldStaff;
	}

	public void setAssessmouldStaff(ErpAmStaff assessmouldStaff) {
		this.assessmouldStaff = assessmouldStaff;
	}

	public ErpSysBasedict getAssessmouldType() {
		return assessmouldType;
	}

	public void setAssessmouldType(ErpSysBasedict assessmouldType) {
		this.assessmouldType = assessmouldType;
	}

    

}