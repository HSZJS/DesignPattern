package com.fnd.design.facade;

/**
 * 
 * 设计模式，外观模式/门面模式，计算机组件接口类
 * 
 * @author Administrator
 *
 */
public interface Components {

	/**
	 * 组件启动
	 */
	public void start();

	/**
	 * 组件停止
	 */
	public void shutDown();

}
