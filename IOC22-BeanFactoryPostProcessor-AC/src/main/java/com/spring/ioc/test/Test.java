package com.spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.dao.DbManager;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		DbManager dbManager = context.getBean(DbManager.class);
		System.out.println(dbManager.getName(1));
	}
}