package com.spring.ioc.beans;

import java.util.Calendar;

public class Reminder {
	
	private Calendar calendar;
	
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public void getReminderDate() {
		System.out.println(calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DATE));
	}
}
