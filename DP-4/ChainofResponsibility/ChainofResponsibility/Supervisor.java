package com.cognizant.designprinciples.ChainofResponsibility;

public class Supervisor implements ILeaveRequestHandler {
	
	ILeaveRequestHandler nextHandler = new ProjectManager();
	
	@Override
	public void HandleRequest(LeaveRequest leave) {
		if (leave.leaveDays < 3) {
			System.out.println(String.format("Leave has been approved for %s by Supervisor", leave.employee));
		}
		else nextHandler.HandleRequest(leave);
	}

}
