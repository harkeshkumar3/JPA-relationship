package com.harkesh.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.GroupLayout.Alignment;


@Entity
@Table(name="address")
public class UserAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String streetNo;
	private String city;
	private String state;
	private int pincode;

	/*
	 * @Embedded private CommonField commonField;
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	/*
	 * public CommonField getCommonField() { return commonField; }
	 * 
	 * public void setCommonField(CommonField commonField) { this.commonField =
	 * commonField; }
	 */

	public UserAddress(int id, String streetNo, String city, String state, int pincode/*, CommonField commonField)*/) {
		super();
		this.id = id;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	//	this.commonField = commonField;
	}
	
	public UserAddress() {
		// TODO Auto-generated constructor stub
	}
	
	

}
