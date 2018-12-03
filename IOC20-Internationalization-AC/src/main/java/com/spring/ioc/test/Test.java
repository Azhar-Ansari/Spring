package com.spring.ioc.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println(applicationContext.getMessage("welcome.title", null, Locale.US));
		System.out.println(applicationContext.getMessage("welcome.title", null, Locale.SIMPLIFIED_CHINESE));
	}
}
