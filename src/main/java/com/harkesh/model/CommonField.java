package com.harkesh.model;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class CommonField {
	
	private boolean isActive;
	private Date createdDate;
	private Date modifiedDate;
	private int createdBy;
	private int modifiedBy;
	
	public CommonField() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CommonField(boolean isActive, Date createdDate, Date modifiedDate, int createdBy, int modifiedBy) {
		super();
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	
	
	

}
