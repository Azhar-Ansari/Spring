package com.spring.ioc.bean;

public class DataSourceManager {
	private String driverclass;
	private String url;
	private String username;
	private String password;

	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataSourceManager [driverclass=" + driverclass + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
}
