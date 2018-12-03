package com.spring.ioc.beans;

public class Assistant {
	MicroPropcessor microProcessor;
	String msg = null;

	public void setMicroProcessor(MicroPropcessor microProcessor) {
		this.microProcessor = microProcessor;
	}

	public void send(String voiceCommand) {
		msg = microProcessor.process(voiceCommand);
		System.out.println(msg);
	}
}
