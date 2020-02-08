package com.junchen.back.pojo;

public class ErpAmRules {
    private Long rulesId;

    private String rulesName;

    private String rulesUrl;

    private String rulesDatetime;

    private ErpAmStaff rulesStaff;

    private String rulesEnable;

    public Long getRulesId() {
        return rulesId;
    }

    public void setRulesId(Long rulesId) {
        this.rulesId = rulesId;
    }

    public String getRulesName() {
        return rulesName;
    }

    public void setRulesName(String rulesName) {
        this.rulesName = rulesName == null ? null : rulesName.trim();
    }

    public String getRulesUrl() {
        return rulesUrl;
    }

    public void setRulesUrl(String rulesUrl) {
        this.rulesUrl = rulesUrl == null ? null : rulesUrl.trim();
    }

    public String getRulesDatetime() {
        return rulesDatetime;
    }

    public void setRulesDatetime(String rulesDatetime) {
        this.rulesDatetime = rulesDatetime == null ? null : rulesDatetime.trim();
    }
    public ErpAmStaff getRulesStaff() {
		return rulesStaff;
	}

	public void setRulesStaff(ErpAmStaff rulesStaff) {
		this.rulesStaff = rulesStaff;
	}

	public String getRulesEnable() {
        return rulesEnable;
    }

    public void setRulesEnable(String rulesEnable) {
        this.rulesEnable = rulesEnable == null ? null : rulesEnable.trim();
    }

	@Override
	public String toString() {
		return "ErpAmRules [rulesId=" + rulesId + ", rulesName=" + rulesName
				+ ", rulesUrl=" + rulesUrl + ", rulesDatetime=" + rulesDatetime
				+ ", rulesStaff=" + rulesStaff + ", rulesEnable=" + rulesEnable
				+ "]";
	}
    
    
}