package com.fnd.design.proxy.impl;

import com.fnd.design.proxy.Subject;

/**
 * 
 * 代理模式proxy,代理的实现
 * @author Administrator
 *
 */
public class ProxySubject implements Subject {
	
	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		subject.request();
	}

}
