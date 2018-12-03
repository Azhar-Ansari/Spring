package com.spring.ioc.servicelocator;

import com.google.geo.service.GoogleIndiaService;
import com.google.geo.service.GoogleService;
import com.google.geo.service.GoogleUSService;

public class GoogleServiceLocator {
	
	private GoogleService googleService;
	
	public GoogleService locateService(String country) {
		if("IN".equalsIgnoreCase(country)) {
			//jndi lookup to fetch obj
			this.googleService = new GoogleIndiaService();			
		} else if("US".equalsIgnoreCase(country)) {
			//jndi lookup to fetch obj
			this.googleService = new GoogleUSService();
		}
		return this.googleService;
	}
}
