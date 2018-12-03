package com.spring.ioc.beans;

public class PdfMessageConverter implements IMessageConverter {

	public String convertMessage(String message) {
		return "PDF Format Message";
	}
}
