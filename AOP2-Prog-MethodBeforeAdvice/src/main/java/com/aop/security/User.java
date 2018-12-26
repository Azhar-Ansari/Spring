package com.aop.security;

import java.util.Objects;

public class User {
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(username, password);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof User){
			User user = (User) obj;
			return this.getUsername().equalsIgnoreCase(user.getUsername()) && 
				  this.getPassword().equalsIgnoreCase(user.getPassword());
		}
		return false;
	}
}
