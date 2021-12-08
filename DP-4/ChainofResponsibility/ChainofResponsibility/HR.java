package com.cognizant.designprinciples.ChainofResponsibility;

public class HR implements ILeaveRequestHandler {
	
	@Override
	public void HandleRequest(LeaveRequest leave) {
		
		System.out.println(String.format("Leave has been approved for %s by HR", leave.employee));
	}

}
