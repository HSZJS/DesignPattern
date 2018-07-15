package com.fnd.design.template.impl;

import org.junit.Test;

public class AbstractBizTest {
	
	@Test
	public void testBizAImpl() {
		BizAImpl bizA = new BizAImpl();
		bizA.biz();
	}
	
	@Test
	public void testBizBImpl() {
		BizBImpl bizB = new BizBImpl();
		bizB.biz();
	}
	
	@Test
	public void testBizBImpl2() {
		BizBImpl bizB = new BizBImpl();
		bizB.impl1();
		bizB.impl3();
		bizB.childMethod();
		bizB.impl2();
		bizB.impl4();
	}
}
