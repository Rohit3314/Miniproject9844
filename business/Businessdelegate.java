package com.business;

public class Businessdelegate 
{

	private Businesslookup bl = new Businesslookup();
	private Businessservice bs;
	private String servicetype;
	
	public void setservicetype(String st)
	{
	   this.servicetype = st; 	
	}
	
	public void dotask()
	{
		bs = bl.getbusinessservice(servicetype);
		bs.doprocessing();
	}
}
