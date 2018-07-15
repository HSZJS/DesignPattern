package com.fnd.design.proxy.impl;

import org.junit.Test;

import com.fnd.design.proxy.Subject;

public class ProxySubjectTest {
	
	@Test
	public void testRequest() {
		Subject subject = new ProxySubject(new RealSubject());
		subject.request();
	}
	
}
