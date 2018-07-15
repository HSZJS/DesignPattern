package com.fnd.design.template.impl;

import com.fnd.design.template.AbstractBiz;

/**
 * 
 * 模板模式template,抽象父类实现类A
 * @author Administrator
 *
 */
public class BizAImpl extends AbstractBiz {

	@Override
	public void childMethod() {
		System.out.println("BizAImpl.class childMethod()的实现!");
	}

}
