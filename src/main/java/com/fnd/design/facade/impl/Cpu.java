package com.fnd.design.facade.impl;

import com.fnd.design.facade.Components;

public class Cpu implements Components {

	@Override
	public void start() {
		System.out.println("cpu start...");
	}
	
	@Override
	public void shutDown() {
		System.out.println("cpu shutDown...");
	}

}
