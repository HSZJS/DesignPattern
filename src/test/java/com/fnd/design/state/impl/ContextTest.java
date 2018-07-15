package com.fnd.design.state.impl;

import org.junit.Test;

public class ContextTest {

	@Test
	public void handleOneDay() {
		Context context = new Context(new LeaveStateOneDayImpl());
		context.handle();
	}
	
	@Test
	public void handleTwoDay() {
		Context context = new Context(new LeaveStateTwoDayImpl());
		context.handle();
	}

	@Test
	public void handleThreeDay() {
		Context context = new Context(new LeaveStateThreeDayImpl());
		context.handle();
	}

}
