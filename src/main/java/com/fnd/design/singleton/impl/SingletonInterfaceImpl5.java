package com.fnd.design.singleton.impl;

/**
 * 
 * 单例模式，singleton实现方式2,懒汉法，考虑了线程安全、和性能的问题
 * @author Administrator
 *
 */
public class SingletonInterfaceImpl5 {
	
	/**
	 * 私有的构造方法
	 */
	private SingletonInterfaceImpl5() {
		super();
	}
	
	private static class Holder {
		private static SingletonInterfaceImpl5 singletonInterfaceImpl5 = new SingletonInterfaceImpl5();
	}
	
	public static SingletonInterfaceImpl5 getInstance() {
		return Holder.singletonInterfaceImpl5;
	}
	
	public void method() {
		System.out.println("singletonInterfaceImpl5.class 执行 method()方法!");
	}
	
}
