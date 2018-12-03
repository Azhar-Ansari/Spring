package com.spring.ioc.beans;

import java.util.List;

public class Customer {
	
	private List<Address> addresses;

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [addresses=" + addresses + "]";
	}
}
