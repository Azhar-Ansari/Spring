package com.i18n.bundle;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

public class AppResourceBundle1 {
	
	private Map<Locale,Properties> localePropertiesMap;
	
	private AppResourceBundle1(Map<Locale,Properties> localePropertiesMap) {
		this.localePropertiesMap = localePropertiesMap;
	}
	
	public static AppResourceBundle1 getBundle(String[] baseNames, Locale[] locale) {
		ResourceBundle resourceBundle = null;
		Properties localeProperties = null;
		Map<Locale,Properties> localePropertiesMap = new HashMap<>();
		for (Locale local: locale) {
			localeProperties = new Properties();
			for(String baseName: baseNames) {
				resourceBundle = ResourceBundle.getBundle(baseName, local);
				Enumeration<String> keys = resourceBundle.getKeys();
				while (keys.hasMoreElements()) {
					String key = keys.nextElement();
					String message = resourceBundle.getString(key);
					localeProperties.put(key, message);
				}
			}
			localePropertiesMap.put(local, localeProperties);	
		}
		return new AppResourceBundle1(localePropertiesMap);
	}
	 
	public String getMessage(String key, Locale locale) {
		return this.localePropertiesMap.get(locale).getProperty(key);
	}
}
