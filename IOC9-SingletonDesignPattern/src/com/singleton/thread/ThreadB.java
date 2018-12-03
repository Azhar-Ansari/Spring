package com.singleton.thread;

import com.singleton.model.Singleton;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
		System.out.println(Singleton.getInstance().hashCode());
	}
}
