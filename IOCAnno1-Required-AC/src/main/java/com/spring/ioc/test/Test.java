package com.spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.beans.MessageWriter;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		MessageWriter messageWriter = (MessageWriter) context.getBean("messageWriter");
		messageWriter.writeMessage("Welcome to Spring Bean");
	}
}
