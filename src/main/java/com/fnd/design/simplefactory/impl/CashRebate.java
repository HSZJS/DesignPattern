package com.fnd.design.simplefactory.impl;

import com.fnd.design.simplefactory.CashSuper;

/**
 * 打折收费实现类
 * @author Administrator
 *
 */
public class CashRebate implements CashSuper {
	
	private double moneyRebate = 1d;
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	@Override
	public Double acceptCash(Double money) {
		return money * moneyRebate;
	}

}
