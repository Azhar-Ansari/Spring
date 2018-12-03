package com.singleton.test;

import com.singleton.thread.ThreadA;
import com.singleton.thread.ThreadB;

public class TestSingleton {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
	}

}
