package com.business;

public class Client 
{

	Businessdelegate bd;
	
	public Client(Businessdelegate bd1)
	{
	   this.bd = bd1;	
	}
	
	public void dotask()
	{
		bd.dotask();
	}
}
