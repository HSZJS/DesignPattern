package com.fnd.design.template.impl;

import com.fnd.design.template.AbstractBiz;

/**
 * 
 * 模板模式template,抽象父类实现类B
 * @author Administrator
 *
 */
public class BizBImpl extends AbstractBiz {

	@Override
	public void childMethod() {
		System.out.println("BizBImpl.class childMethod()的实现!");
	}

}
