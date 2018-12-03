package com.spring.ioc.factory;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactory implements FactoryBean<Calendar> {

	@Override
	public Calendar getObject() throws Exception {
		return Calendar.getInstance();
	}

	@Override
	public Class<?> getObjectType() {
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
