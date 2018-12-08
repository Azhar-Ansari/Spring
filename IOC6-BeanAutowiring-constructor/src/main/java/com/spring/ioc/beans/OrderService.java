package com.spring.ioc.beans;

public class OrderService {
	
	private DTDCService dtdcService;
	private BlueDartService blueDartService;
	
	public OrderService() {}
	
	public OrderService(DTDCService dtdcService) {
		System.out.println("constructor called with dtdcService param");
		this.dtdcService = dtdcService;
	}

	public OrderService(BlueDartService blueDartService) {
		System.out.println("constructor called with blueDartService param");
		this.blueDartService = blueDartService;
	}

	public OrderService(DTDCService dtdcService, BlueDartService blueDartService) {
		System.out.println("constructor called with dtdcService & blueDartService param");
		this.dtdcService = dtdcService;
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
		return "OrderService [dtdcService=" + dtdcService + ", blueDartService=" + blueDartService + "]";
	}
	
}
