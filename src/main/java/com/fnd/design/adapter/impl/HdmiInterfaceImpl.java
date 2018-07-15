package com.fnd.design.adapter.impl;

import com.fnd.design.adapter.HdmiInterface;

public class HdmiInterfaceImpl implements HdmiInterface{

	@Override
	public void doHdmiOut() {
		System.out.println("现在做HDMI的视频输出!");
	}

}
