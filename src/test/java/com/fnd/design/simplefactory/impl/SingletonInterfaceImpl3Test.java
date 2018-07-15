package com.fnd.design.simplefactory.impl;

import org.junit.Test;

import com.fnd.design.singleton.impl.SingletonInterfaceImpl3;

public class SingletonInterfaceImpl3Test {
	
	@Test
	public void testImpl1Method() {
		SingletonInterfaceImpl3.getInstance().method();
	}
	
	@Test
	public void testImpl1GetInstance() {
		SingletonInterfaceImpl3 s1 = SingletonInterfaceImpl3.getInstance();
		SingletonInterfaceImpl3 s2 = SingletonInterfaceImpl3.getInstance();
		if(s1 == s2) {
			System.out.println("SingletonInterfaceImpl3 两个对象是相同的实例!");
		}
	}
	
	
}
