package com.i18n.bundle;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

public class AppResourceBundle2 {
	
	private String[] baseNames;
	private Map<Locale,Properties> localePropertiesMap;
	private static AppResourceBundle2 instance;
	
	private AppResourceBundle2(String[] baseNames) {
		this.baseNames = baseNames;
		this.localePropertiesMap = new HashMap<>();
	}
	
	public static AppResourceBundle2 getBundle(String[] strings) {
		if(instance == null) {
			instance = new AppResourceBundle2(strings); 
		}
		return instance;
	}
	 
	public String getMessage(String code, Locale locale) {
		if(!this.localePropertiesMap.containsKey(locale)) {
			Properties localeProperties = getLocaleProperties(locale);
			this.localePropertiesMap.put(locale, localeProperties);
		}
		return this.localePropertiesMap.get(locale).getProperty(code);
	}

	private Properties getLocaleProperties(Locale locale) {
		ResourceBundle resourceBundle = null;
		Properties localeProperties = new Properties();
		for(String baseName: this.baseNames) {
			resourceBundle = ResourceBundle.getBundle(baseName, locale);
			Enumeration<String> keys = resourceBundle.getKeys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String message = resourceBundle.getString(key);
				localeProperties.put(key, message);
			}
		}
		return localeProperties;
	}
}
