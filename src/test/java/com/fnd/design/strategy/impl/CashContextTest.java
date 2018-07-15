package com.fnd.design.strategy.impl;

import org.junit.Before;
import org.junit.Test;

public class CashContextTest {
	
	private double money = 0.0d;
	
	@Before
	public void init() {
		money = 500d;//设置待收款
	}
	
	@Test
	public void testGetResultMoney1() {
		double result = new CashContext("正常收费").getResultMoney(money);
		System.out.println("【正常收费】原价：" + money + " 现价:" + result);
	}
	
	@Test
	public void testGetResultMoney2() {
		double result = new CashContext("满300减100").getResultMoney(money);
		System.out.println("【满300减100】原价：" + money + " 现价:" + result);
	}
	
	@Test
	public void testGetResultMoney3() {
		double result = new CashContext("打8折").getResultMoney(money);
		System.out.println("【打8折】原价：" + money + " 现价:" + result);
	}
	
	@Test
	public void testGetResultMoney4() {
		double result = new CashContext("不存在的收费方案").getResultMoney(money);
		System.out.println("【不存在的收费方案】原价：" + money + " 现价:" + result);
	}
	
}
