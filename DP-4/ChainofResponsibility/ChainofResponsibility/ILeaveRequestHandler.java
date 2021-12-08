package com.cognizant.designprinciples.ChainofResponsibility;

public interface ILeaveRequestHandler {
	
	public ILeaveRequestHandler nextHandler;
	public void HandleRequest (LeaveRequest leave);

}
