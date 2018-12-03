package com.spring.ioc.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.spring.ioc.event.ReloadEvent;

public class UpdateCityController implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void updateCity(int cityId, String cityName) {
		ReloadEvent reloadEvent = new ReloadEvent(this);
		reloadEvent.setId(cityId);
		reloadEvent.setCityName(cityName);
		applicationEventPublisher.publishEvent(reloadEvent);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
}
