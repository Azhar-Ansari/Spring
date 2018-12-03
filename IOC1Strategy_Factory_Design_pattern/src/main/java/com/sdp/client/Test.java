package com.sdp.client;

import com.sdp.beans.IMessageConverter;
import com.sdp.beans.MessageWriter;
import com.sdp.factory.AppClassFactory;

public class Test {
	public static void main(String[] args) {
		MessageWriter messageWriter = (MessageWriter)AppClassFactory.createObject("messageWriter.class");
		IMessageConverter messageConverter = (IMessageConverter)AppClassFactory.createObject("messageConverter.class");
		messageWriter.setMessageConverter(messageConverter);
		messageWriter.writeMessage("Strategy Design Pattern");
	}
}
