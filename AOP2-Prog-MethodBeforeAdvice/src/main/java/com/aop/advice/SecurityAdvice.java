package com.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.security.access.AccessDeniedException;

import com.aop.security.SecurityManager;
import com.aop.security.User;

public class SecurityAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		SecurityManager securityManager = SecurityManager.getInstance();
		User user = securityManager.getCurrentUser();
		if(!securityManager.isAuthenticated(user))
			throw new AccessDeniedException("User is not Authorised");
	}	
}
