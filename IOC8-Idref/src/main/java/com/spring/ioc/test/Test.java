package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.SportsCar;

public class Test {
	
	public static void main(String[] args) {
		BeanFactory carFactory = new XmlBeanFactory(new ClassPathResource("sportscar-application-context.xml"));
		SportsCar sportsCar = carFactory.getBean("sportsCar", SportsCar.class);
		sportsCar.drive();
	}
}
