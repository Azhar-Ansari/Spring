package com.spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.bean.UpdateCityController;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		UpdateCityController controller = applicationContext.getBean(UpdateCityController.class);
		controller.updateCity(1, "Mumbai");
	}
}
