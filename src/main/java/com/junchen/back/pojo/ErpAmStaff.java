package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpAmStaff implements Serializable{
    private Long staffId;

    private String staffName;

    private String staffGender;

    private String staffCardid;

    private String staffPhone;

    private String staffAddress;

    private ErpSysBasedict staffType;

    private ErpSysBasedict staffDepartment;

    private ErpSysBasedict staffTitles;

    private String staffPhoto;

    private String staffContract;

    private ErpSysBasedict staffEducation;

    private String staffHealth;

    private String staffEnable;
    
    private String staffIndate;

    private String staffOutdate;

    public String getStaffIndate() {
		return staffIndate;
	}

	public void setStaffIndate(String staffIndate) {
		this.staffIndate = staffIndate;
	}

	public String getStaffOutdate() {
		return staffOutdate;
	}

	public void setStaffOutdate(String staffOutdate) {
		this.staffOutdate = staffOutdate;
	}

	public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender == null ? null : staffGender.trim();
    }

    public String getStaffCardid() {
        return staffCardid;
    }

    public void setStaffCardid(String staffCardid) {
        this.staffCardid = staffCardid == null ? null : staffCardid.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress == null ? null : staffAddress.trim();
    }

    public ErpSysBasedict getStaffType() {
        return staffType;
    }

    public void setStaffType(ErpSysBasedict staffType) {
        this.staffType = staffType;
    }

    public ErpSysBasedict getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(ErpSysBasedict staffDepartment) {
        this.staffDepartment = staffDepartment ;
    }

    public ErpSysBasedict getStaffTitles() {
        return staffTitles;
    }

    public void setStaffTitles(ErpSysBasedict staffTitles) {
        this.staffTitles = staffTitles;
    }

    public String getStaffPhoto() {
        return staffPhoto;
    }

    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto == null ? null : staffPhoto.trim();
    }

    public String getStaffContract() {
        return staffContract;
    }

    public void setStaffContract(String staffContract) {
        this.staffContract = staffContract == null ? null : staffContract.trim();
    }
    public ErpSysBasedict getStaffEducation() {
		return staffEducation;
	}

	public void setStaffEducation(ErpSysBasedict staffEducation) {
		this.staffEducation = staffEducation;
	}

	public String getStaffHealth() {
        return staffHealth;
    }

    public void setStaffHealth(String staffHealth) {
        this.staffHealth = staffHealth == null ? null : staffHealth.trim();
    }

    public String getStaffEnable() {
        return staffEnable;
    }

    public void setStaffEnable(String staffEnable) {
        this.staffEnable = staffEnable == null ? null : staffEnable.trim();
    }

	public ErpAmStaff() {
		super();
	}

	@Override
	public String toString() {
		return "ErpAmStaff [staffId=" + staffId + ", staffName=" + staffName
				+ ", staffGender=" + staffGender + ", staffCardid="
				+ staffCardid + ", staffPhone=" + staffPhone
				+ ", staffAddress=" + staffAddress + ", staffType=" + staffType
				+ ", staffDepartment=" + staffDepartment + ", staffTitles="
				+ staffTitles + ", staffPhoto=" + staffPhoto
				+ ", staffContract=" + staffContract + ", staffEducation="
				+ staffEducation + ", staffHealth=" + staffHealth
				+ ", staffEnable=" + staffEnable + "]";
	}
    
    
}