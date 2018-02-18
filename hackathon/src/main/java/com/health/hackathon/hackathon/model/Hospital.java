package com.health.hackathon.hackathon.model;

public class Hospital {

	private String name;
	private String ContactNo;
	//private String longitude;
	//private String latitude;
	private String hospitalType;
	private String advancedFacility;
	private String address;
	private String website;
	private String state;
	private String district;
	private String Government;
	private short noOfDoctors ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	
	public String getHospitalType() {
		return hospitalType;
	}
	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}
	public String getAdvancedFacility() {
		return advancedFacility;
	}
	public void setAdvancedFacility(String advancedFacility) {
		this.advancedFacility = advancedFacility;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getGovernment() {
		return Government;
	}
	public void setGovernment(String government) {
		Government = government;
	}
	public short getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(short noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
}
