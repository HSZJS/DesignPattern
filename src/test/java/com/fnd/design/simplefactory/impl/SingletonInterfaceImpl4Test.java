package com.fnd.design.simplefactory.impl;

import org.junit.Test;

import com.fnd.design.singleton.impl.SingletonInterfaceImpl4;

public class SingletonInterfaceImpl4Test {
	
	@Test
	public void testImpl1Method() {
		SingletonInterfaceImpl4.getInstance().method();
	}
	
	@Test
	public void testImpl1GetInstance() {
		SingletonInterfaceImpl4 s1 = SingletonInterfaceImpl4.getInstance();
		SingletonInterfaceImpl4 s2 = SingletonInterfaceImpl4.getInstance();
		if(s1 == s2) {
			System.out.println("SingletonInterfaceImpl4 两个对象是相同的实例!");
		}
	}
	
	
}
