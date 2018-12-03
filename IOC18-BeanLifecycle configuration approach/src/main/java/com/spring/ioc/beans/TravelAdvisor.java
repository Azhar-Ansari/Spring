package com.spring.ioc.beans;

public class TravelAdvisor {
	
	private String currLocation;
	private Coordinate srcCoordinate;
	private Coordinate destCoordinate;
	private String transportMode;
	
	public TravelAdvisor(String currLocation) {
		this.currLocation= currLocation;
		System.out.println(String.format("Coordinate before init method: Src %s, Dest %s", srcCoordinate,destCoordinate));
	}
	
	public void init() {
		System.out.println("Your current location...."+currLocation);
		System.out.println(String.format("Coordinate: Src %s, Dest %s", srcCoordinate,destCoordinate));
	}
	
	public void setSrcCoordinate(Coordinate srcCoordinate) {
		this.srcCoordinate = srcCoordinate;
	}
	public void setDestCoordinate(Coordinate destCoordinate) {
		this.destCoordinate = destCoordinate;
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
		return "TravelAdvisor [currLocation=" + currLocation + ", srcCoordinate=" + srcCoordinate + ", destCoordinate="
				+ destCoordinate + ", transportMode=" + transportMode + "]";
	}
	
}
