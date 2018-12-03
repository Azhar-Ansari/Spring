package com.spring.ioc.beans;

import java.util.Map;

public class BusinessUnit {

	private String domainName;
	private Map<String, Team> projects;

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public BusinessUnit(Map<String, Team> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "BusinessUnit [domainName=" + domainName + ", projects=" + projects + "]"+"\n"
				+"Class[projects: "+projects.getClass().getName()+"]";
	}
	
}
