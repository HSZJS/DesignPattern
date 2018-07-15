package com.fnd.design.facade.impl;

import com.fnd.design.facade.Components;

public class ComputerFacade {
	
	private Components cpu = new Cpu();
	private Components disk = new Disk();
	private Components memory = new Memory();
	
	public void cpuStart() {
		cpu.start();
	}
	
	public void cpuShutDown() {
		cpu.shutDown();
	}
	
	public void diskStart() {
		disk.start();	
	}
	
	public void diskShutDown() {
		disk.shutDown();
	}
	
	public void memoryStart() {
		memory.start();
	}
	
	public void memoryShutDown() {
		memory.shutDown();
	}
	
	public void start() {
		cpu.start();
		disk.start();
		memory.start();
	}
	
	public void shutDown() {
		cpu.shutDown();
		disk.shutDown();
		memory.shutDown();
	}
	
}
