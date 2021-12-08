package com.cognizant.designprinciples.ChainofResponsibility;

public class LeaveRequest {
	
	public int leaveDays;
	public String employee;
	
	public LeaveRequest(int leaveDays, String employee) {
	this.leaveDays = leaveDays;
	this.employee = employee;
	}

}
