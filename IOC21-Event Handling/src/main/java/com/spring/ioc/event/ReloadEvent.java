package com.spring.ioc.event;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent{
	
	private int id;
	private String cityName;
	private static final long serialVersionUID = -1292289021912859428L;

	public ReloadEvent(Object source) {
		super(source);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
