package com.example.cms.dto;

import java.time.LocalDateTime;

public class UserResponse {
	private int userid;
	private String username;
	private String email;
	
	private LocalDateTime CreatedAt;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}
	public LocalDateTime getLastmodifiedAt() {
		return LastmodifiedAt;
	}
	public void setLastmodifiedAt(LocalDateTime lastmodifiedAt) {
		LastmodifiedAt = lastmodifiedAt;
	}
	private LocalDateTime LastmodifiedAt;
	
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userId) {
		this.userid = userId;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

