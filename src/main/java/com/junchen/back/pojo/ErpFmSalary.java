package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpFmSalary implements Serializable{
    private Long salaryId;

    private String salaryName;

    private ErpAmStaff salaryStaff;

    private String salaryDate;

    private String salaryMemo;

    private String salaryEnable;

    private ErpAmStaff salaryBoss;

    private String salaryBossdate;

    private String salaryBossmemo;

    public Long getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }

    public String getSalaryName() {
        return salaryName;
    }

    public void setSalaryName(String salaryName) {
        this.salaryName = salaryName == null ? null : salaryName.trim();
    }

  
    public String getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(String salaryDate) {
        this.salaryDate = salaryDate == null ? null : salaryDate.trim();
    }

    public String getSalaryMemo() {
        return salaryMemo;
    }

    public void setSalaryMemo(String salaryMemo) {
        this.salaryMemo = salaryMemo == null ? null : salaryMemo.trim();
    }

    public String getSalaryEnable() {
        return salaryEnable;
    }

    public void setSalaryEnable(String salaryEnable) {
        this.salaryEnable = salaryEnable == null ? null : salaryEnable.trim();
    }


    public String getSalaryBossdate() {
        return salaryBossdate;
    }

    public void setSalaryBossdate(String salaryBossdate) {
        this.salaryBossdate = salaryBossdate == null ? null : salaryBossdate.trim();
    }

    public String getSalaryBossmemo() {
        return salaryBossmemo;
    }

    public void setSalaryBossmemo(String salaryBossmemo) {
        this.salaryBossmemo = salaryBossmemo == null ? null : salaryBossmemo.trim();
    }

	public ErpAmStaff getSalaryStaff() {
		return salaryStaff;
	}

	public void setSalaryStaff(ErpAmStaff salaryStaff) {
		this.salaryStaff = salaryStaff;
	}

	public ErpAmStaff getSalaryBoss() {
		return salaryBoss;
	}

	public void setSalaryBoss(ErpAmStaff salaryBoss) {
		this.salaryBoss = salaryBoss;
	}
    
    
    
}