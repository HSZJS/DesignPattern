package com.fnd.design.bridge.impl;

import java.util.List;

import com.fnd.design.bridge.HandsetBrand;
import com.fnd.design.bridge.HandsetSoft;

public class HandsetHTC extends HandsetBrand {
	
	public HandsetHTC(List<HandsetSoft> handsetSofts) {
		super(handsetSofts);
	}
	
	@Override
	public void run() {
		for(HandsetSoft hs : handsetSofts) {
			hs.run();
		}
	}

}
