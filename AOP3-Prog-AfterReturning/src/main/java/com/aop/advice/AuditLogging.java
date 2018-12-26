package com.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;

import com.aop.service.LoanDetails;

public class AuditLogging implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		LoanDetails loanDetails = (LoanDetails)args[0];
		System.out.println("Auditing loan details");
		System.out.println("Loan type: "+loanDetails.getType());
		System.out.println("Amount: "+loanDetails.getAmount());
		System.out.println("Status: "+loanDetails.getStatus());
		System.out.println("Guaranteer: "+loanDetails.getGuaranteer());
	}
}
