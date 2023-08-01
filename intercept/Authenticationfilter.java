package com.intercept;

public class Authenticationfilter implements Filter 
{

	@Override
	public void execute(String request)
	{
	    System.out.println("Authenticating request : "+ request);	
	}

	
}
