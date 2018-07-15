package com.fnd.design.facade.impl;

import com.fnd.design.facade.Components;

public class Memory implements Components {

	@Override
	public void start() {
		System.out.println("Memory start...");
	}
	
	@Override
	public void shutDown() {
		System.out.println("Memory shutDown...");
	}

}
