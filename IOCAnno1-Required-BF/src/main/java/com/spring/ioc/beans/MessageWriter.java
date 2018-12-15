package com.spring.ioc.beans;

import org.springframework.beans.factory.annotation.Required;

public class MessageWriter {

	private int messageConverterId;
	private IMessageConverter messageConverter;

	@Required
	public void setMessageConverterId(int messageConverterId) {
		this.messageConverterId = messageConverterId;
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}

	public void writeMessage(String message) {
		String cMessage = null;
		cMessage = messageConverter.convertMessage(message);
		System.out.println(messageConverterId + ": " + cMessage);
	}
}
