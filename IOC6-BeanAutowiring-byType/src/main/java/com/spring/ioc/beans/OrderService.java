package com.spring.ioc.beans;

public class OrderService {
	
	private BlueDartService blueDartService1;
	private BlueDartService blueDartService2;
	
	public OrderService() {}
	
	public OrderService(BlueDartService blueDartService2) {
		this.blueDartService2 = blueDartService2;
	}

	public void setBlueDartService1(BlueDartService blueDartService1) {
		this.blueDartService1 = blueDartService1;
	}
	
	public void setBlueDartService2(BlueDartService blueDartService2) {
		this.blueDartService2 = blueDartService2;
	}
	
	public void deliverOrder() {
		blueDartService1.deliverOrder();
	}

	@Override
	public String toString() {
		return "OrderService [blueDartService2=" + blueDartService2 + "]";
	}	
	
}
