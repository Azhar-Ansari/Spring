package com.spring.ioc.beans;

public class TravelAdvisor {
	
	private Coordinate srcCoordinate;
	private Coordinate destCoordinate;
	private String transportMode;
	
	public void setSrcCoordinate(Coordinate srcCoordinate) {
		this.srcCoordinate = srcCoordinate;
	}
	public void setDestCoordinate(Coordinate destCoordinate) {
		this.destCoordinate = destCoordinate;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	@Override
	public String toString() {
		return "TravelAdvisor [srcCoordinate=" + srcCoordinate + ", destCoordinate=" + destCoordinate
				+ ", transportMode=" + transportMode + "]";
	}
}
