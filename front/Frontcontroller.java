package com.front;

public class Frontcontroller 
{

	private Dispatcher d;
	
	public Frontcontroller()
	{
		d = new Dispatcher();
	}
	
	private boolean isauthenticuser()
	{
		System.out.println("user authenticated successfully");
		return true;
	}
	
	private void trackrequest(String request)
	{
        System.out.println("Page requested : "+request);		
	}
	public void dispatchrequest(String request)
	{
		trackrequest(request);
		if(isauthenticuser())
		{
			d.dispatch(request);
		}
	}
	
	
}
