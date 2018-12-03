package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.OrderService;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		OrderService orderService = beanFactory.getBean("orderService", OrderService.class);
		orderService.deliverOrder();
	}
}
