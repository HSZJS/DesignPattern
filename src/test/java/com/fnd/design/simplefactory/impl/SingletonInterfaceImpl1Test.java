package com.fnd.design.simplefactory.impl;

import org.junit.Test;

import com.fnd.design.singleton.impl.SingletonInterfaceImpl1;

public class SingletonInterfaceImpl1Test {
	
	@Test
	public void testImpl1Method() {
		SingletonInterfaceImpl1.getInstance().method();
	}
	
	@Test
	public void testImpl1GetInstance() {
		SingletonInterfaceImpl1 s1 = SingletonInterfaceImpl1.getInstance();
		SingletonInterfaceImpl1 s2 = SingletonInterfaceImpl1.getInstance();
		if(s1 == s2) {
			System.out.println("SingletonInterfaceImpl1 两个对象是相同的实例!");
		}
	}
	
	
}
