package com.spring.ioc.beans;

public class Address {
	
	private String line1;
	private int zipCode;
	private String city;

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", zipCode=" + zipCode + ", city=" + city + "]";
	}	
}
