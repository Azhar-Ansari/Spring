package com.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.advice.AuditLogging;
import com.aop.service.Audit;
import com.aop.service.LoanDetails;

public class AfterReturningAdviceTest {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Audit());
		proxyFactory.addAdvice(new AuditLogging());
		Audit audit = (Audit) proxyFactory.getProxy();
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setType("Personal");
		loanDetails.setAmount(100000);
		loanDetails.setStatus("Approved");
		loanDetails.setGuaranteer("Tom");
		audit.audit(loanDetails);
	}
}
