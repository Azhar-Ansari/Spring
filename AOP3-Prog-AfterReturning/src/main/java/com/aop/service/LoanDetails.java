package com.aop.service;

public class LoanDetails {
	
	private String type;
	private double amount;
	private String status;
	private String guaranteer;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGuaranteer() {
		return guaranteer;
	}
	public void setGuaranteer(String guaranteer) {
		this.guaranteer = guaranteer;
	}
}
