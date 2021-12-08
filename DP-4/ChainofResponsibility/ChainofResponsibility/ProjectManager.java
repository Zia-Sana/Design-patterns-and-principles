package com.cognizant.designprinciples.ChainofResponsibility;

public class ProjectManager implements ILeaveRequestHandler {
	
	ILeaveRequestHandler nextHandler = new HR();
	
	@Override
	public void HandleRequest(LeaveRequest leave) {
		if (leave.leaveDays <= 5) {
			System.out.println(String.format("Leave has been approved for %s by Project Manager", leave.employee));
		}
		else nextHandler.HandleRequest(leave);
	}

}
