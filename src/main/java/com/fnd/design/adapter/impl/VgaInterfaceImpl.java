package com.fnd.design.adapter.impl;

import com.fnd.design.adapter.VgaInterface;

public class VgaInterfaceImpl implements VgaInterface{
	
	@Override
	public void doVgaOut() {
		System.out.println("现在做VGA的视频输出!");
	}

}
