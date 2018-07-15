package com.fnd.design.bridge.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fnd.design.bridge.HandsetBrand;
import com.fnd.design.bridge.HandsetSoft;

public class HandsetBrandTest {
	
	@Test
	public void testIPhoneRun() {
		List<HandsetSoft> handsetSofts = new ArrayList<HandsetSoft>();
		
		HandsetSoft game = new HandsetGame();
		handsetSofts.add(game);
		HandsetSoft addressList = new HandsetAddressList();
		handsetSofts.add(addressList);
		
		HandsetBrand iphone = new HandsetIPhone(handsetSofts);
		iphone.run();
		
	}
	
	@Test
	public void testHTCRun() {
		List<HandsetSoft> handsetSofts = new ArrayList<HandsetSoft>();
		HandsetSoft addressList = new HandsetAddressList();
		handsetSofts.add(addressList);
		
		HandsetBrand iphone = new HandsetHTC(handsetSofts);
		iphone.run();
		
	}
	
}
