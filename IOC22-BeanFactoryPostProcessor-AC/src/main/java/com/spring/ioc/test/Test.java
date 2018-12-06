package com.spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.bean.DataSourceManager;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		DataSourceManager dsSourceManager = context.getBean(DataSourceManager.class);
		System.out.println(dsSourceManager);
	}
}