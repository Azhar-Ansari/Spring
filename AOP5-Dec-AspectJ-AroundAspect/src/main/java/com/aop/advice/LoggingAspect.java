package com.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect{

	public Object log(ProceedingJoinPoint pjp) throws Throwable{
		String methodName = pjp.getSignature().getName(); 
		Object[] args = pjp.getArgs();
		System.out.println("Method "+methodName+ " called with args: "+args[0]+", "+args[1]);
		Object retVal = pjp.proceed();
		System.out.println("Return value "+retVal);
		return retVal;
	}
}
