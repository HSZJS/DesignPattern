package com.fnd.design.singleton.impl;

/**
 * 
 * 单例模式，singleton实现方式2,懒汉法，考虑了线程安全、和性能的问题，也叫双重检查锁方法，不能再JDK1.5之前的版本中使用
 * @author Administrator
 *
 */
public class SingletonInterfaceImpl4 {
	
	private volatile static SingletonInterfaceImpl4 singletonInterfaceImpl4 = null;
	
	/**
	 * 私有的构造方法
	 */
	private SingletonInterfaceImpl4() {
		super();
	}
	
	public static SingletonInterfaceImpl4 getInstance() {
		if(null == singletonInterfaceImpl4) {
			synchronized(SingletonInterfaceImpl3.class) {
				if(null == singletonInterfaceImpl4) {
					singletonInterfaceImpl4 =  new SingletonInterfaceImpl4();
				}
			}
		}
		return singletonInterfaceImpl4;
	}
	
	public void method() {
		System.out.println("singletonInterfaceImpl4.class 执行 method()方法!");
	}
	
}
