package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.Assistant;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/spring/ioc/commons/application-context.xml"));
		Assistant assistant = (Assistant) beanFactory.getBean("assistant", Assistant.class);
		assistant.send("process successful");
	}
}
