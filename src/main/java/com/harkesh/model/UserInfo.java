package com.harkesh.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
	
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private CommonField commonField;
	private List<RoleEntity> roles = new ArrayList<RoleEntity>();
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CommonField getCommonField() {
		return commonField;
	}
	public void setCommonField(CommonField commonField) {
		this.commonField = commonField;
	}
	public List<RoleEntity> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
	
	

}
