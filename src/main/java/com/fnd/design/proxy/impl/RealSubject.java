package com.fnd.design.proxy.impl;

import com.fnd.design.proxy.Subject;

/**
 * 
 * 代理模式，真实的实现类
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject.class 执行  request()");
	}

}
