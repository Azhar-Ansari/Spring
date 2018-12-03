package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.AmazonOrderService;

public class Test {

	public static void main(String[] args) {
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
			AmazonOrderService amazonOrderService = factory.getBean("amazonOrderService", AmazonOrderService.class);
			amazonOrderService.deliverCourier("hyd");
	}
}
