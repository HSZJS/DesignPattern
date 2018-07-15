package com.fnd.design.simplefactory.impl;

import org.junit.Test;

import com.fnd.design.singleton.impl.SingletonInterfaceImpl5;

public class SingletonInterfaceImpl5Test {
	
	@Test
	public void testImpl1Method() {
		SingletonInterfaceImpl5.getInstance().method();
	}
	
	@Test
	public void testImpl1GetInstance() {
		SingletonInterfaceImpl5 s1 = SingletonInterfaceImpl5.getInstance();
		SingletonInterfaceImpl5 s2 = SingletonInterfaceImpl5.getInstance();
		if(s1 == s2) {
			System.out.println("SingletonInterfaceImpl5 两个对象是相同的实例!");
		}
	}
	
	
}
