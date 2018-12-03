package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.Address;

public class Test {

	public static void main(String[] args) {
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
			Address address1 = factory.getBean("address",Address.class);
			System.out.println(address1.hashCode());
			
			Address address2 = factory.getBean("address",Address.class);
			System.out.println(address2.hashCode());
			
	}
}
