package com.spring.ioc.beans;

public class Coordinate {
	private float xCoordinate;
	private float yCoordinate;
	
	public void setxCoordinate(float xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public void setyCoordinate(float yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	@Override
	public String toString() {
		return "Coordinate [xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + "]";
	}
}
