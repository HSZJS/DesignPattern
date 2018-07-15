package com.fnd.design.singleton.impl;

/**
 * 
 * 单例模式，singleton实现方式2,懒汉法
 * @author Administrator
 *
 */
public class SingletonInterfaceImpl2 {
	
	private static SingletonInterfaceImpl2 singletonInterfaceImpl2;
	
	/**
	 * 私有的构造方法
	 */
	private SingletonInterfaceImpl2() {
		super();
	}
	
	public static SingletonInterfaceImpl2 getInstance() {
		if(null == singletonInterfaceImpl2) {
			singletonInterfaceImpl2 =  new SingletonInterfaceImpl2();
		}
		return singletonInterfaceImpl2;
	}
	
	public void method() {
		System.out.println("singletonInterfaceImpl2.class 执行 method()方法!");
	}
	
}
