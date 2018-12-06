package com.spring.ioc.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.dao.DbManager;


public class Test {

	public static void main(String[] args) {
		ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		PropertyPlaceholderConfigurer ppc = beanFactory.getBean(PropertyPlaceholderConfigurer.class);
		ppc.postProcessBeanFactory(beanFactory);
		DbManager dbManager = beanFactory.getBean(DbManager.class);
		System.out.println(dbManager.getName(1));
	}
}