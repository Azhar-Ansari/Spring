package com.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName(); 
		Object[] args = invocation.getArguments();
		System.out.println("Method "+methodName+ " called with args: "+args[0]+", "+args[1]);
		Object retVal = invocation.proceed();
		System.out.println("Return value "+retVal);
		return retVal;
	}

}
