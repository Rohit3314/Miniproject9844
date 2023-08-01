package com.business;

public class Businessdemo 
{
	public static void main(String[] args)
	{

		Businessdelegate b1 = new Businessdelegate();
		b1.setservicetype("EJB");
       
		Client c1 = new Client(b1);
		c1.dotask();
		
		b1.setservicetype("JMS");
		c1.dotask();
		
		
	}

}
