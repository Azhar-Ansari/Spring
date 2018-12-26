package com.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggingAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Method method, Object[] args, Object target, ArithmeticException ae){
		System.out.println("Inside afterThrowing(-,-,-,-) ArithmeticException while executing '"+method.getName()+"' method"+ae.getMessage());
	}
	
	public void afterThrowing(ArithmeticException ae){
		System.out.println("Inside afterThrowing(-) ArithmeticException "+ae.getMessage());
		throw new RuntimeException(ae);
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception e){
		System.out.println("Inside afterThrowing(-) Exception while executing "+method.getName()+": "+e.getMessage());
	}
}
