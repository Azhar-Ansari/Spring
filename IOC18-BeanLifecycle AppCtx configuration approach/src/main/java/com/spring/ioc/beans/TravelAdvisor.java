package com.spring.ioc.beans;

public class TravelAdvisor {
	
	private String currLocation;
	private String transportMode;
	
	public TravelAdvisor(String currLocation) {
		this.currLocation= currLocation;
	}
	
	public void init() {
		System.out.println("Your current location...."+currLocation);
	}
	
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	
	public void destroy() {
		this.currLocation = "0.0, 0.0";
		System.out.println("Resetting current location...."+currLocation);
	}

	@Override
	public String toString() {
		return "TravelAdvisor [currLocation=" + currLocation + ", transportMode=" + transportMode + "]";
	}
}
