package com.spring.ioc.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.bean.DataSourceManager;


public class Test {

	public static void main(String[] args) {
		ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		PropertyPlaceholderConfigurer ppc = beanFactory.getBean(PropertyPlaceholderConfigurer.class);
		ppc.postProcessBeanFactory(beanFactory);
		DataSourceManager dsSourceManager = beanFactory.getBean(DataSourceManager.class);
		System.out.println(dsSourceManager);
	}
}