package com.intercept;
import java.util.*;

public class Filterchain 
{

	private List<Filter> f1 = new ArrayList<Filter>();
	private Target t;
	
	public void addfilter(Filter f2)
	{
	   f1.add(f2);  	
	}
	public void execute( String request)
	{
	   for(Filter f3:f1)
	   {
		 f3.execute(request);   
	   }
	   t.execute(request);
	}
	
	public void settarget(Target t)
	{
	   	this.t = t;
	}
}








