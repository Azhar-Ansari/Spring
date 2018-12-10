package com.spring.ioc.bean;

import java.io.IOException;
import java.util.Properties;

import com.spring.ioc.accessor.CacheData;

public class CachePropData implements CacheData {

	private String key;

	@Override
	public Properties getData() {
		Properties properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("city_ri.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	@Override
	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}

}
