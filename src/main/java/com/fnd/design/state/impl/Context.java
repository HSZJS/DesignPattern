package com.fnd.design.state.impl;

import com.fnd.design.state.LeaveState;

/**
 * 设计模式，状态模式State
 * @author Administrator
 *
 */
public class Context {

	private LeaveState leaveState;

	public Context(LeaveState leaveState) {
		super();
		this.leaveState = leaveState;
	}
	
	public void handle() {
		this.leaveState.handle();
	}
}
