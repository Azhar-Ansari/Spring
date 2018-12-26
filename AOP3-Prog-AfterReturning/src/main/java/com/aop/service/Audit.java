package com.aop.service;

public class Audit {
	
	public void audit(LoanDetails details) {
		System.out.println("Logging audit to db");
	}
}
