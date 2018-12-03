package com.spring.ioc.beans;

public class OrderService {
	
	private BlueDartService blueDartService;
	
	public OrderService() {}
	
	public OrderService(BlueDartService blueDartService) {
		super();
		this.blueDartService = blueDartService;
	}

	public void setBlueDartService(BlueDartService blueDartService) {
		this.blueDartService = blueDartService;
	}
	
	public void deliverOrder() {
		blueDartService.deliverOrder();
	}

	@Override
	public String toString() {
		return "OrderService [blueDartService=" + blueDartService + "]";
	}
}
