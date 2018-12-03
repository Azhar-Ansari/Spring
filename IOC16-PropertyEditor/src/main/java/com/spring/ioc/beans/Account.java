package com.spring.ioc.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

public class Account {
	
	private String name;
	private File profilepic;
	private URL blog;
	private String[] friends;

	public void setName(String name) {
		this.name = name;
	}

	public void setProfilepic(File profilepic) {
		this.profilepic = profilepic;
	}

	public void setBlog(URL blog) {
		this.blog = blog;
	}

	public void setFriends(String[] friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", profilepic=" + profilepic + ", blog=" + blog + ", friends="
				+ Arrays.toString(friends) + "]";
	}
}
