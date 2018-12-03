package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.OrderService;

public class Test {
	public static void main(String[] args) {
		BeanFactory courierBeanFactory = new XmlBeanFactory(new ClassPathResource("courier-application-context.xml"));
		BeanFactory orderBeanFactory = new XmlBeanFactory(new ClassPathResource("orderservice-application-context.xml"),courierBeanFactory);
		OrderService orderService = orderBeanFactory.getBean("orderService", OrderService.class);
		orderService.deliverOrder();
	}
}
