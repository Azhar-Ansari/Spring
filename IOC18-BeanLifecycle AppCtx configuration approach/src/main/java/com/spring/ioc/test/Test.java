package com.spring.ioc.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.beans.TravelAdvisor;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		TravelAdvisor travelAdvisor = applicationContext.getBean("travelAdvisor", TravelAdvisor.class);
		System.out.println(travelAdvisor);
		applicationContext.close();
	}
}
