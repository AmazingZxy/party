package org.party.zxy.domain;

import java.io.Serializable;

public class Type implements Serializable{
	private Integer id;
	private String name;
	private String remark;
	
	
	public Type() {
		super();
	}
	public Type(Integer id, String name, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}
	
	
}
