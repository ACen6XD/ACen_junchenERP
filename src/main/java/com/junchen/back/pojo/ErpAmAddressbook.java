package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpAmAddressbook implements Serializable{
    private Long addressbookId;

    private String addressbookName;

    private String addressbookGender;

    private String addressbookQq;

    private String addressbookTelephone;

    private String addressbookPhone;

    private String addressbookWechat;

    private String addressbookFax;

    private String addressbookEmail;

    private String addressbookCompanyname;

    private String addressbookCompanyphone;

    private String addressbookCompanyaddress;

    private String addressbookCompanyweb;

    private String addressbookMemo;

    private String addressbookEnable;

    private String addressbookJob;

    private ErpAmStaff addressbookStaff;

    public Long getAddressbookId() {
        return addressbookId;
    }

    public void setAddressbookId(Long addressbookId) {
        this.addressbookId = addressbookId;
    }

    public String getAddressbookName() {
        return addressbookName;
    }

    public void setAddressbookName(String addressbookName) {
        this.addressbookName = addressbookName == null ? null : addressbookName.trim();
    }

    public String getAddressbookGender() {
        return addressbookGender;
    }

    public void setAddressbookGender(String addressbookGender) {
        this.addressbookGender = addressbookGender == null ? null : addressbookGender.trim();
    }

    public String getAddressbookQq() {
        return addressbookQq;
    }

    public void setAddressbookQq(String addressbookQq) {
        this.addressbookQq = addressbookQq == null ? null : addressbookQq.trim();
    }

    public String getAddressbookTelephone() {
        return addressbookTelephone;
    }

    public void setAddressbookTelephone(String addressbookTelephone) {
        this.addressbookTelephone = addressbookTelephone == null ? null : addressbookTelephone.trim();
    }

    public String getAddressbookPhone() {
        return addressbookPhone;
    }

    public void setAddressbookPhone(String addressbookPhone) {
        this.addressbookPhone = addressbookPhone == null ? null : addressbookPhone.trim();
    }

    public String getAddressbookWechat() {
        return addressbookWechat;
    }

    public void setAddressbookWechat(String addressbookWechat) {
        this.addressbookWechat = addressbookWechat == null ? null : addressbookWechat.trim();
    }

    public String getAddressbookFax() {
        return addressbookFax;
    }

    public void setAddressbookFax(String addressbookFax) {
        this.addressbookFax = addressbookFax == null ? null : addressbookFax.trim();
    }

    public String getAddressbookEmail() {
        return addressbookEmail;
    }

    public void setAddressbookEmail(String addressbookEmail) {
        this.addressbookEmail = addressbookEmail == null ? null : addressbookEmail.trim();
    }

    public String getAddressbookCompanyname() {
        return addressbookCompanyname;
    }

    public void setAddressbookCompanyname(String addressbookCompanyname) {
        this.addressbookCompanyname = addressbookCompanyname == null ? null : addressbookCompanyname.trim();
    }

    public String getAddressbookCompanyphone() {
        return addressbookCompanyphone;
    }

    public void setAddressbookCompanyphone(String addressbookCompanyphone) {
        this.addressbookCompanyphone = addressbookCompanyphone == null ? null : addressbookCompanyphone.trim();
    }

    public String getAddressbookCompanyaddress() {
        return addressbookCompanyaddress;
    }

    public void setAddressbookCompanyaddress(String addressbookCompanyaddress) {
        this.addressbookCompanyaddress = addressbookCompanyaddress == null ? null : addressbookCompanyaddress.trim();
    }

    public String getAddressbookCompanyweb() {
        return addressbookCompanyweb;
    }

    public void setAddressbookCompanyweb(String addressbookCompanyweb) {
        this.addressbookCompanyweb = addressbookCompanyweb == null ? null : addressbookCompanyweb.trim();
    }

    public String getAddressbookMemo() {
        return addressbookMemo;
    }

    public void setAddressbookMemo(String addressbookMemo) {
        this.addressbookMemo = addressbookMemo == null ? null : addressbookMemo.trim();
    }

    public String getAddressbookEnable() {
        return addressbookEnable;
    }

    public void setAddressbookEnable(String addressbookEnable) {
        this.addressbookEnable = addressbookEnable == null ? null : addressbookEnable.trim();
    }

    public String getAddressbookJob() {
        return addressbookJob;
    }

    public void setAddressbookJob(String addressbookJob) {
        this.addressbookJob = addressbookJob == null ? null : addressbookJob.trim();
    }

	public ErpAmStaff getAddressbookStaff() {
		return addressbookStaff;
	}

	public void setAddressbookStaff(ErpAmStaff addressbookStaff) {
		this.addressbookStaff = addressbookStaff;
	}

	@Override
	public String toString() {
		return "ErpAmAddressbook [addressbookId=" + addressbookId
				+ ", addressbookName=" + addressbookName
				+ ", addressbookGender=" + addressbookGender
				+ ", addressbookQq=" + addressbookQq
				+ ", addressbookTelephone=" + addressbookTelephone
				+ ", addressbookPhone=" + addressbookPhone
				+ ", addressbookWechat=" + addressbookWechat
				+ ", addressbookFax=" + addressbookFax + ", addressbookEmail="
				+ addressbookEmail + ", addressbookCompanyname="
				+ addressbookCompanyname + ", addressbookCompanyphone="
				+ addressbookCompanyphone + ", addressbookCompanyaddress="
				+ addressbookCompanyaddress + ", addressbookCompanyweb="
				+ addressbookCompanyweb + ", addressbookMemo="
				+ addressbookMemo + ", addressbookEnable=" + addressbookEnable
				+ ", addressbookJob=" + addressbookJob + ", addressbookStaff="
				+ addressbookStaff + "]";
	}
	
	
   
}