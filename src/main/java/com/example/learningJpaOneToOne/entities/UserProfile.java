package com.example.learningJpaOneToOne.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserProfile {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="address")
	private String address;
	@Column(name="phone_number")
	private String phoneNumber;
	
	public UserProfile() {
		super();
	}

	public UserProfile(int id, String address, String phoneNumber) {
		super();
		this.id = id;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
