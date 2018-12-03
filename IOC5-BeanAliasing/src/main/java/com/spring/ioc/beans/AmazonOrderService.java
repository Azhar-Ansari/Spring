package com.spring.ioc.beans;

public class AmazonOrderService {

	private CourierService blueDartService;
	private CourierService dtdcService;

	public void setBlueDartService(CourierService blueDartService) {
		this.blueDartService = blueDartService;
	}

	public void setDtdcService(CourierService dtdcService) {
		this.dtdcService = dtdcService;
	}
	
	public void deliverCourier(String city) {
		if("hyd".equalsIgnoreCase(city)) {
			blueDartService.deliver();
		} else {
			dtdcService.deliver();
		}
	}
}
