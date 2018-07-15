package com.fnd.design.template;

/**
 * 模板模式template抽象类
 * @author Administrator
 *
 */
public abstract class AbstractBiz {
	
	public void impl1() {
		System.out.println("impl1()的实现");
	}
	
	public void impl2() {
		System.out.println("impl2()的实现");
	}
	
	public abstract void childMethod();
	
	public void impl3() {
		System.out.println("impl3()的实现");
	}
	
	public void impl4() {
		System.out.println("impl4()的实现");
	}
	
	public void biz() {
		this.impl1();
		this.impl2();
		this.childMethod();
		this.impl3();
		this.impl4();
	}
	
}
