package com.fnd.design.facade.impl;

import com.fnd.design.facade.Components;

public class Disk implements Components {

	@Override
	public void start() {
		System.out.println("Disk start...");
	}
	
	@Override
	public void shutDown() {
		System.out.println("Disk shutDown...");
	}

}
