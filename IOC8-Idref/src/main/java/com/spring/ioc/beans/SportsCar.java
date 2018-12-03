package com.spring.ioc.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SportsCar {
	
	private IEngine engine;
	private String manufacturer;

	public SportsCar(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void drive() {
		BeanFactory engineFactory = new XmlBeanFactory(new ClassPathResource("engine-application-context.xml"));
		BeanFactory sportsCarFactory = new XmlBeanFactory(new ClassPathResource("sportscar-application-context.xml"), engineFactory);
		engine = sportsCarFactory.getBean(manufacturer, IEngine.class);
		engine.start();
		System.out.println("Driving Sports Car");
	}

	@Override
	public String toString() {
		return "SportsCar [engine=" + engine + ", manufacturer=" + manufacturer + "]";
	}
	
}
