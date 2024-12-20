package com.example.learningJpaOneToOne.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String userName;
	@Column(name="user_profile_id")
	private int userProfileId;
	
	@OneToOne
	@JoinColumn(name= "id", referencedColumnName = "id")
	private UserProfile userProfile;
	
	public User() {
		super();
	}

	public User(int id, String userName, int userProfileId) {
		super();
		this.id = id;
		this.userName = userName;
		this.userProfileId = userProfileId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	
	
}
