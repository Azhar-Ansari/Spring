package com.aop.service;

public class Calculator {

	public double divide(String num1, String num2) {
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		return number1 / number2;
	}
}
