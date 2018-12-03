package com.spring.ioc.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.beans.Coordinate;
import com.spring.ioc.beans.TravelAdvisor;
import com.spring.ioc.editor.CoordinatePropertyEditor;

public class Test {

	public static void main(String[] args) {
		ConfigurableListableBeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		factory.addPropertyEditorRegistrar(registry-> registry.registerCustomEditor(Coordinate.class, new CoordinatePropertyEditor()));
		TravelAdvisor travelAdvisor = factory.getBean("travelAdvisor", TravelAdvisor.class);
		System.out.println(travelAdvisor);
	}
}
