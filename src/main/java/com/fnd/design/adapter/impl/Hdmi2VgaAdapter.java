package com.fnd.design.adapter.impl;

import com.fnd.design.adapter.HdmiInterface;
import com.fnd.design.adapter.VgaInterface;

/**
 * 适配器模式，HDMI标准适配实现VGA
 * 
 * @author Administrator
 *
 */
public class Hdmi2VgaAdapter implements HdmiInterface {

	@Override
	public void doHdmiOut() {
		VgaInterface vgaImpl = new VgaInterfaceImpl();
		vgaImpl.doVgaOut();
	}

}
