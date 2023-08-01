package com.intercept;

public class Debugfilter implements Filter
{

	@Override
	public void execute(String request)
	{	
	   System.out.println("Request log : "+ request);	
	}

	 
}
