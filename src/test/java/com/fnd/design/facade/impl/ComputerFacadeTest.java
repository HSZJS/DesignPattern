package com.fnd.design.facade.impl;

import org.junit.Test;

public class ComputerFacadeTest {

	@Test
	public void testCpuStart() {
		new ComputerFacade().cpuStart();
	}
	
	@Test
	public void testStart() {
		new ComputerFacade().start();
	}

}
