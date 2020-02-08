package com.junchen.back.myentity;

import java.io.Serializable;
import java.util.List;
/**
 * 分页结果实体类
 * @author 岑洛彬
 *
 */
public class PageResult implements Serializable{
	private Long total;//总记录数
	private List rows;//每页显示的记录
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public PageResult(Long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public PageResult() {
		super();
	}
	
	
}
