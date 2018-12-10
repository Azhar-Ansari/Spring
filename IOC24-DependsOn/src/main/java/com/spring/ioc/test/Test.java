package com.spring.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.bean.LoanCalculator;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		LoanCalculator loanCalculator = beanFactory.getBean(LoanCalculator.class);
		float loanAmount = 0;
		try {
			loanAmount = loanCalculator.calculateLoanAmount("hyd", 100000, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Estimated loan: " + loanAmount);
	}
}