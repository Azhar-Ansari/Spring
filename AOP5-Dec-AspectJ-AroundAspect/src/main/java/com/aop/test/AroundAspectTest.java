package com.aop.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.Calculator;

public class AroundAspectTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Calculator calculator = applicationContext.getBean(Calculator.class);
		calculator.add(10, 20);
	}
}
