package com.google.geo.service;

import java.util.Arrays;
import java.util.List;

public class GoogleIndiaService implements GoogleService {

	@Override
	public List<String> getcoordinates(String src, String dest) {
		return Arrays.asList("0,0","2,2","4,4");
	}
}
