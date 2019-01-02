package com.spring;

import java.util.ArrayList;

import javax.validation.constraints.Size;



public class Student {

	private String name;
	
	@Size(min=2, max=4 )
	private String hobby;
	
//	@Size(min=2, max=4 )
	private Long mobile;
//	private Date date;
	private ArrayList<String> skills;
	private Address address;

	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
