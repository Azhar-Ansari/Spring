package com.i18n.bundle.test;

import java.util.Locale;

import com.i18n.bundle.AppResourceBundle1;

public class ARBTest1 {

	public static void main(String[] args) {
		AppResourceBundle1 resourceBundle1 = AppResourceBundle1.getBundle(new String[]{"messages","error"}, new Locale[] {Locale.JAPANESE,Locale.ENGLISH});
		System.out.println(resourceBundle1.getMessage("registration.success",Locale.JAPANESE));
		System.out.println(resourceBundle1.getMessage("error.pagenotfound",Locale.ENGLISH));
	}
}
