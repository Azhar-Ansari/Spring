package com.spring.ioc.beans;

import java.util.Calendar;

public class Reminder {
	
	private Calendar calendar;

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	@Override
	public String toString() {
		return "Reminder [calendar=" + calendar + "]";
	}
}
