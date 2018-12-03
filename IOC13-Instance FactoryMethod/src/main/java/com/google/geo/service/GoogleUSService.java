package com.google.geo.service;

import java.util.Arrays;
import java.util.List;

public class GoogleUSService implements GoogleService {

	@Override
	public List<String> getcoordinates(String src, String dest) {
		return Arrays.asList("1,1","3,3","5,5");
	}
}
