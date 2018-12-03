package com.spring.ioc.test;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		MessageSource messageSource = beanFactory.getBean("messageSource", MessageSource.class);
		System.out.println(messageSource.getMessage("welcome.title", null, Locale.US));
		System.out.println(messageSource.getMessage("welcome.title", null, Locale.SIMPLIFIED_CHINESE));
	}
}
