package com.fnd.design.state.impl;

import com.fnd.design.state.LeaveState;

public class LeaveStateOneDayImpl implements LeaveState {

	@Override
	public void handle() {
		System.out.println("请假1天的实现，项目经理审批!");
	}

}
