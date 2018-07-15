package com.fnd.design.simplefactory;

/**
 * 收费接口类
 * @author Administrator
 *
 */
public interface CashSuper {
	
	/**
	 * 收费实现
	 * @param money 收费原始金额
	 * @return
	 */
	Double acceptCash(Double money);
	
}
