package com.fnd.design.simplefactory.impl;

import com.fnd.design.simplefactory.CashSuper;

/**
 * 简单工厂模式SimpleFactory
 * @author Administrator
 *
 */
public class SimpleFactory {
	
	public CashSuper getCashAccept(String type) {
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
		return cs;
	}
	
}
