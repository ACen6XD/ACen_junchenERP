package com.junchen.back.pojo;

import java.io.Serializable;

public class ErpSysBasedict implements Serializable {
    private String dictId;

    private String dictTypeCode;

    private String dictTypeName;

    private String dictItemCode;

    private String dictItemName;

    private String dictMemo;

    private Integer dictSort;

    private String dictEnable;

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId == null ? null : dictId.trim();
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode == null ? null : dictTypeCode.trim();
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName == null ? null : dictTypeName.trim();
    }

    public String getDictItemCode() {
        return dictItemCode;
    }

    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode == null ? null : dictItemCode.trim();
    }

    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName == null ? null : dictItemName.trim();
    }

    public String getDictMemo() {
        return dictMemo;
    }

    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo == null ? null : dictMemo.trim();
    }

    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictEnable() {
        return dictEnable;
    }

    public void setDictEnable(String dictEnable) {
        this.dictEnable = dictEnable == null ? null : dictEnable.trim();
    }

	@Override
	public String toString() {
		return "ErpSysBasedict [dictId=" + dictId + ", dictTypeCode="
				+ dictTypeCode + ", dictTypeName=" + dictTypeName
				+ ", dictItemCode=" + dictItemCode + ", dictItemName="
				+ dictItemName + ", dictMemo=" + dictMemo + ", dictSort="
				+ dictSort + ", dictEnable=" + dictEnable + "]";
	}
    
}