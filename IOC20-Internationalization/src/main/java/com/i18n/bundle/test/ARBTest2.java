package com.i18n.bundle.test;

import java.util.Locale;

import com.i18n.bundle.AppResourceBundle2;

public class ARBTest2 {

	public static void main(String[] args) {
		AppResourceBundle2 resourceBundle2 = AppResourceBundle2.getBundle(new String[]{"messages","error"});
		System.out.println(resourceBundle2.getMessage("registration.success",Locale.CHINESE));
		System.out.println(resourceBundle2.getMessage("error.pagenotfound",Locale.ENGLISH));
	}
}
