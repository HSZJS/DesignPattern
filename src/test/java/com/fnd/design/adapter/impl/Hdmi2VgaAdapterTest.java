package com.fnd.design.adapter.impl;

import org.junit.Test;

import com.fnd.design.adapter.HdmiInterface;
import com.fnd.design.adapter.VgaInterface;

public class Hdmi2VgaAdapterTest {

	@Test
	public void doVgaOut() {
		VgaInterface vgaImpl = new VgaInterfaceImpl();
		vgaImpl.doVgaOut();
	}

	@Test
	public void doHdmiOut() {
		HdmiInterface hdmiImpl = new HdmiInterfaceImpl();
		hdmiImpl.doHdmiOut();
	}

	@Test
	public void doHdmi2VgaOut() {
		HdmiInterface hdmiImpl = new Hdmi2VgaAdapter();
		hdmiImpl.doHdmiOut();
	}

}
