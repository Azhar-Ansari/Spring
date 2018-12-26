package com.aop.security;

import java.util.ArrayList;
import java.util.List;

public class SecurityManager {
	
	private ThreadLocal<User> user = new ThreadLocal<>();
	private List<User> authorisedUsers = new ArrayList<>();
	private static SecurityManager instance;
	
	private SecurityManager() {}
	
	public static synchronized SecurityManager getInstance(){
		if(instance == null){
			instance = new SecurityManager();
		}
		return instance;
	}
	
	public boolean isAuthenticated(User user){
		return this.authorisedUsers.contains(user);
	}
	
	public void login(User usr){
		this.authorisedUsers.add(usr);
		this.user.set(usr);
	}
	
	public User getCurrentUser(){
		return this.user.get();
	}
	
	public void logout(){
		this.authorisedUsers.remove(this.user.get());
		this.user.remove();
	}
}
