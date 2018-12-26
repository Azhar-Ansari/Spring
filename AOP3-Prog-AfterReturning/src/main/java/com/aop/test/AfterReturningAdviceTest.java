package com.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.advice.LoggingAdvice;
import com.aop.service.Calculator;

public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		proxyFactory.addAdvice(new LoggingAdvice());
		Calculator calculator = (Calculator) proxyFactory.getProxy();
		calculator.add(10, 20);
	}
}
