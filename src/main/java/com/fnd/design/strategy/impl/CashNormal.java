package com.fnd.design.strategy.impl;

import com.fnd.design.simplefactory.CashSuper;

/**
 * 正常收费实现类
 * @author Administrator
 *
 */
public class CashNormal implements CashSuper {

	@Override
	public Double acceptCash(Double money) {
		return money;
	}

}
