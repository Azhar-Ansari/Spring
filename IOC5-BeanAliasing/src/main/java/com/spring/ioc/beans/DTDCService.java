package com.spring.ioc.beans;

public class DTDCService implements CourierService {

	@Override
	public boolean deliver() {
		System.out.println("Delivered using dtdc");
		return true;
	}

}
