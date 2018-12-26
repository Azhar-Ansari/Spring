package com.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.advice.ExceptionLoggingAdvice;
import com.aop.service.Calculator;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		proxyFactory.addAdvice(new ExceptionLoggingAdvice());
		Calculator calculator = (Calculator) proxyFactory.getProxy();
		// System.out.println(calculator.divide("3","0"));
		System.out.println(calculator.divide("a","b"));
	}
}
