package com.sdp.factory;

import java.io.IOException;
import java.util.Properties;

public class AppClassFactory {

	public static Object createObject(String key) {
		Properties properties = new Properties();
		Object object = null;
		try {
			properties.load(AppClassFactory.class.getResourceAsStream("/appClasses.properties"));
			String clazz = properties.getProperty(key);
			object = Class.forName(clazz).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return object;
	}
}
