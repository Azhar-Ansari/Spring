package com.i18n.bundle;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class GlobalResourceBundle {
	
	private Properties properties;
	
	private GlobalResourceBundle(Properties properties) {
		this.properties = properties;
	}
	
	public static GlobalResourceBundle getBundle(String[] baseNames, Locale locale) {
		 ResourceBundle resourceBundle = null;
		 Properties properties = new Properties();
		 for (String baseName : baseNames) {
			 resourceBundle = ResourceBundle.getBundle(baseName, locale);
			 Enumeration<String> keys = resourceBundle.getKeys();
			 while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String message = resourceBundle.getString(key);
				properties.put(key, message);
			}
		}
		return new GlobalResourceBundle(properties);
	}
	 
	public String getMessage(String key) {
		return this.properties.getProperty(key);
	}
}
