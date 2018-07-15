package com.fnd.design.strategy.impl;

import com.fnd.design.simplefactory.CashSuper;

/**
 * 满减收费实现类
 * @author Administrator
 *
 */
public class CashReturn implements CashSuper {
	
	/** 满多少 **/
	private double moneyCondition = 0.0d;
	
	/** 减多少 **/
	private double moneyReturn = 0.0d;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	public Double acceptCash(Double money) {
		double result = money;
		if(money > moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
