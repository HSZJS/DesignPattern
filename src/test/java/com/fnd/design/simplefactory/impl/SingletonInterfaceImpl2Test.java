package com.fnd.design.simplefactory.impl;

import org.junit.Test;

import com.fnd.design.singleton.impl.SingletonInterfaceImpl2;

public class SingletonInterfaceImpl2Test {
	
	@Test
	public void testImpl1Method() {
		SingletonInterfaceImpl2.getInstance().method();
	}
	
	@Test
	public void testImpl1GetInstance() {
		SingletonInterfaceImpl2 s1 = SingletonInterfaceImpl2.getInstance();
		SingletonInterfaceImpl2 s2 = SingletonInterfaceImpl2.getInstance();
		if(s1 == s2) {
			System.out.println("SingletonInterfaceImpl2 两个对象是相同的实例!");
		}
	}
	
	
}
