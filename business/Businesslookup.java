package com.business;

public class Businesslookup 
{

	public Businessservice getbusinessservice(String servicetype)
	{
	
		if(servicetype.equalsIgnoreCase("EJB"))
		return new EJBservice();
		else
		return new JMSservice();	
	}
}
