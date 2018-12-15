package com.spring.ioc.beans;

public class HtmlMessageConverter implements IMessageConverter {

	public String convertMessage(String message) {
		return "HTML Format Message";
	}
}
