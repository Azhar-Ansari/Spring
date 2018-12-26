package com.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.advice.SecurityAdvice;
import com.aop.security.SecurityManager;
import com.aop.security.User;
import com.aop.service.LoanManager;

public class MethodBeforeAdviceTest {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new LoanManager());
		proxyFactory.addAdvice(new SecurityAdvice());
		LoanManager loanManager = (LoanManager) proxyFactory.getProxy();
		SecurityManager securityManager = SecurityManager.getInstance();
		securityManager.login(new User("admin","secret"));
		loanManager.approveLoan(100000);
		securityManager.logout();
		loanManager.approveLoan(100000);
	}

}
