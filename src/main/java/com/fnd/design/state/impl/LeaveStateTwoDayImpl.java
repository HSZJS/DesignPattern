package com.fnd.design.state.impl;

import com.fnd.design.state.LeaveState;

public class LeaveStateTwoDayImpl implements LeaveState {

	@Override
	public void handle() {
		System.out.println("请假2天的实现，项目经理+项目群经理审批!");
	}

}
