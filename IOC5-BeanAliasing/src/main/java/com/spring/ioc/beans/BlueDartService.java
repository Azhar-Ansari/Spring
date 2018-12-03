package com.spring.ioc.beans;

public class BlueDartService implements CourierService {

	@Override
	public boolean deliver() {
		System.out.println("Delivered using bluedart");
		return true;
	}

}
