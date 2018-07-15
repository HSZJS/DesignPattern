package com.fnd.design.state.impl;

import com.fnd.design.state.LeaveState;

public class LeaveStateThreeDayImpl implements LeaveState {

	@Override
	public void handle() {
		System.out.println("请假3天的实现，项目经理+项目群经理+部门经理审批!");
	}

}
