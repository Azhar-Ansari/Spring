package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.IMessageConverter;
import com.spring.ioc.beans.MessageWriter;

public class Test {

	public static void main(String[] args) {
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/spring/ioc/commons/application-context.xml"));
			MessageWriter messageWriter = (MessageWriter)factory.getBean("messageWriter");
			messageWriter.writeMessage("Welcome to Spring Bean");
	}
}
