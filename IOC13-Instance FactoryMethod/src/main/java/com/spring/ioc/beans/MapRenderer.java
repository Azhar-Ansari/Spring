package com.spring.ioc.beans;

import java.util.List;

import com.google.geo.service.GoogleService;

public class MapRenderer {
	
	private GoogleService googleService;
	
	public void setGoogleService(GoogleService googleService) {
		this.googleService = googleService;
	}

	public void renderMap() {
		List<String> coordinates = this.googleService.getcoordinates("hyd", "mum");
		System.out.println(coordinates);
	}
	
}
