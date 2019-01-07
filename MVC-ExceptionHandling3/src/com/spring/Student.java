package com.spring;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;



public class Student {

	@Pattern(regexp="[^0-9]*")
	private String name;
	
//	@Size(min=2, max=10,message="size must be greater than {min} and less than {max}" )
	@Size(min=2,max=15) @IsValidHobby
	private String hobby;
	
//	@Size(min=2, max=4 )
//	@NonNull [Not null is not working]
 	@Max(800)
	private Long mobile;
	
	@Past
	private Date dob;
	
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

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
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
