package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.Team;

public class Test {

	public static void main(String[] args) {
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/spring/ioc/commons/application-context.xml"));
			Team team = factory.getBean("team",Team.class);
			System.out.println(team);
	}
}
