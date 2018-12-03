package com.spring.ioc.beans;

public class Address {
	
	private String line1;
	private int zipCode;
	private String city;

	public Address(String line1, int zipCode, String city) {
		super();
		this.line1 = line1;
		this.zipCode = zipCode;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", zipCode=" + zipCode + ", city=" + city + "]";
	}	
}
