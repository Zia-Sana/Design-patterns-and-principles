package com.cognizant.designprinciples.ChainofResponsibility;

public class Main {
	
	public static void main(String[]args) {
		
		LeaveRequest leave = new LeaveRequest(2,"Ruksana");
		Supervisor supervisor = new Supervisor();
		supervisor.HandleRequest(leave);
	}

}
