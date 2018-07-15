package com.fnd.design.bridge;

import java.util.List;

/**
 * 设计模式，桥接模式，手机品牌接口类
 * @author Administrator
 *
 */
public abstract class HandsetBrand {
	
	protected List<HandsetSoft> handsetSofts;
	
	public HandsetBrand(List<HandsetSoft> handsetSofts) {
		this.handsetSofts = handsetSofts;
	}
	
	/**
	 * 运行手机上的软件
	 */
	public abstract void run();
	
}
