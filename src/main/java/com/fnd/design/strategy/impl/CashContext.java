package com.fnd.design.strategy.impl;

import com.fnd.design.simplefactory.CashSuper;

/**
 * 
 * 策略模式Startegy
 * @author Administrator
 *
 */
public class CashContext {
	
	private CashSuper cs = null;
	
	public CashContext(String type) {
		CashSuper cs = null;
		switch(type) {
			case "正常收费":
				cs = new CashNormal();
				break;
			case "满300减100":
				cs = new CashReturn(300d,100d);
				break;
			case "打8折":
				cs = new CashRebate(0.8d);
				break;
			default:
				throw new RuntimeException("不存在的收费方案!");
		}
		this.cs = cs;
	}
	
	/**
	 * 获取最终金额
	 * @param money
	 * @return
	 */
	public double getResultMoney(double money) {
		return cs.acceptCash(money);
	}
	
}
