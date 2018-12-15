package com.spring.ioc.test;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.MessageWriter;

public class Test {

	public static void main(String[] args) {
		ConfigurableListableBeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		RequiredAnnotationBeanPostProcessor rAnnotationBeanPostProcessor = factory.getBean(RequiredAnnotationBeanPostProcessor.class);
		factory.addBeanPostProcessor(rAnnotationBeanPostProcessor);
		MessageWriter messageWriter = (MessageWriter) factory.getBean("messageWriter");
		messageWriter.writeMessage("Welcome to Spring Bean");
	}
}
