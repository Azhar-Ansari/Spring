package com.sdp.factory;

import com.sdp.beans.HtmlMessageConverter;
import com.sdp.beans.IMessageConverter;
import com.sdp.beans.PdfMessageConverter;

public class MessageConverterFactory {
	public static IMessageConverter createConverter(String type) {
		IMessageConverter messageConverter = null;
		if ("HTML".equalsIgnoreCase(type)) {
			messageConverter = new HtmlMessageConverter();
		} else if ("PDF".equalsIgnoreCase(type)) {
			messageConverter = new PdfMessageConverter();
		}
		return messageConverter;
	}
}
