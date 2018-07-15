package com.fnd.design.singleton.impl;

/**
 * 
 * 单例模式，singleton实现方式2,懒汉法，考虑了线程安全的问题
 * @author Administrator
 *
 */
public class SingletonInterfaceImpl3 {
	
	private volatile static SingletonInterfaceImpl3 singletonInterfaceImpl3 = null;
	
	/**
	 * 私有的构造方法
	 */
	private SingletonInterfaceImpl3() {
		super();
	}
	
	public static SingletonInterfaceImpl3 getInstance() {
		synchronized(SingletonInterfaceImpl3.class) {
			if(null == singletonInterfaceImpl3) {
				singletonInterfaceImpl3 =  new SingletonInterfaceImpl3();
			}
		}
		return singletonInterfaceImpl3;
	}
	
	public void method() {
		System.out.println("singletonInterfaceImpl3.class 执行 method()方法!");
	}
	
}
