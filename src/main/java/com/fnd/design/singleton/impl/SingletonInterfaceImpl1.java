package com.fnd.design.singleton.impl;

/**
 * 
 * 单例模式，singleton实现,饿汉法
 * @author Administrator
 *
 */
public class SingletonInterfaceImpl1 {
	
	private static SingletonInterfaceImpl1 singletonInterfaceImpl1 = new SingletonInterfaceImpl1();
	
	/**
	 * 私有的构造方法
	 */
	private SingletonInterfaceImpl1() {
		super();
	}
	
	public static SingletonInterfaceImpl1 getInstance() {
		return singletonInterfaceImpl1;
	}
	
	public void method() {
		System.out.println("SingletonInterfaceImpl1.class 执行 method()方法!");
	}
	
}
