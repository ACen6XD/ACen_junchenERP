package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpAmLogbook implements Serializable{
    private Long logbookId;

    private String logbookTitle;

    private String logbookContent;

    private String logbookStudy;

    private String logbookSummary;

    private String logbookDate;

    private ErpAmStaff logbookStaff;

    private ErpAmStaff logbookApprover;

    private String logbookApprovermsg;

    private String logbookApproverdate;

    private String logbookEnable;

    public Long getLogbookId() {
        return logbookId;
    }

    public void setLogbookId(Long logbookId) {
        this.logbookId = logbookId;
    }

    public String getLogbookTitle() {
        return logbookTitle;
    }

    public void setLogbookTitle(String logbookTitle) {
        this.logbookTitle = logbookTitle == null ? null : logbookTitle.trim();
    }

    public String getLogbookContent() {
        return logbookContent;
    }

    public void setLogbookContent(String logbookContent) {
        this.logbookContent = logbookContent == null ? null : logbookContent.trim();
    }

    public String getLogbookStudy() {
        return logbookStudy;
    }

    public void setLogbookStudy(String logbookStudy) {
        this.logbookStudy = logbookStudy == null ? null : logbookStudy.trim();
    }

    public String getLogbookSummary() {
        return logbookSummary;
    }

    public void setLogbookSummary(String logbookSummary) {
        this.logbookSummary = logbookSummary == null ? null : logbookSummary.trim();
    }

    public String getLogbookDate() {
        return logbookDate;
    }

    public void setLogbookDate(String logbookDate) {
        this.logbookDate = logbookDate == null ? null : logbookDate.trim();
    }
    public ErpAmStaff getLogbookStaff() {
		return logbookStaff;
	}

	public void setLogbookStaff(ErpAmStaff logbookStaff) {
		this.logbookStaff = logbookStaff;
	}

	public ErpAmStaff getLogbookApprover() {
		return logbookApprover;
	}

	public void setLogbookApprover(ErpAmStaff logbookApprover) {
		this.logbookApprover = logbookApprover;
	}

	public String getLogbookApprovermsg() {
        return logbookApprovermsg;
    }

    public void setLogbookApprovermsg(String logbookApprovermsg) {
        this.logbookApprovermsg = logbookApprovermsg == null ? null : logbookApprovermsg.trim();
    }

    public String getLogbookApproverdate() {
        return logbookApproverdate;
    }

    public void setLogbookApproverdate(String logbookApproverdate) {
        this.logbookApproverdate = logbookApproverdate == null ? null : logbookApproverdate.trim();
    }

    public String getLogbookEnable() {
        return logbookEnable;
    }

    public void setLogbookEnable(String logbookEnable) {
        this.logbookEnable = logbookEnable == null ? null : logbookEnable.trim();
    }
}