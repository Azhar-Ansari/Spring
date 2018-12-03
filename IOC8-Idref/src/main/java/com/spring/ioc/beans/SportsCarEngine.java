package com.spring.ioc.beans;

public class SportsCarEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("SportsCar engine started");
	}

}
