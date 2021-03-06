package com.spring.ioc.beans;

public class MessageWriter {
	private IMessageConverter messageConverter;
	
	public MessageWriter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	
	public void writeMessage(String message) {
		String cMessage = null;
		cMessage = messageConverter.convertMessage(message);
		System.out.println(cMessage);
	}
}
