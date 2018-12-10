package com.spring.ioc.bean;

import java.util.Properties;

public class LoanCalculator {

	private Cache cache;

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public float calculateLoanAmount(String city, int principal, int term) throws Exception {
		if (!cache.contains("cityriprop"))
			throw new Exception("Cache not initialized");

		Properties cityRiProps = (Properties) cache.get("cityriprop");
		String ri = cityRiProps.getProperty(city);
		float roi = Float.parseFloat(ri);
		return principal + (principal * roi * term) / 100;
	}
}
