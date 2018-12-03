package com.spring.ioc.factory;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactory implements FactoryBean<Calendar> {

	private int year;
	private int month;
	private int date;
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public Calendar getObject() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.year, this.month, this.date);
		return calendar;
	}

	@Override
	public Class<Calendar> getObjectType() {
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
