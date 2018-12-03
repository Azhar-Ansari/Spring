package com.spring.ioc.listener;

import org.springframework.context.ApplicationListener;

import com.spring.ioc.event.ReloadEvent;

public class ReloadEventListener implements ApplicationListener<ReloadEvent>{

	@Override
	public void onApplicationEvent(ReloadEvent event) {
		System.out.println(event.getCityName());
	}
}
