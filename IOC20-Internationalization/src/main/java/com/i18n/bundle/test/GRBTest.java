package com.i18n.bundle.test;

import java.util.Locale;

import com.i18n.bundle.GlobalResourceBundle;

public class GRBTest {

	public static void main(String[] args) {
		GlobalResourceBundle resourceBundle1 = GlobalResourceBundle.getBundle(new String[]{"messages","error"}, Locale.JAPANESE);
		System.out.println(resourceBundle1.getMessage("registration.success"));
		System.out.println(resourceBundle1.getMessage("error.pagenotfound"));
	}
}
