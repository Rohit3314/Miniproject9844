package com.front;

public class Dispatcher
{
	
	private Homeview hv;
	private Studentview sv;
	
	public Dispatcher()
	{
		hv = new Homeview();
		sv = new Studentview();
	}
	
	public void dispatch(String request)
	{
	    	if(request.equalsIgnoreCase("student"))
	    	{
	    		sv.show();
	    	}
	    	else
	    	{
	           hv.show();   		
	    	}
	}
}
