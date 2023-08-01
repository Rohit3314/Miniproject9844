package com.intercept;

public class Interceptdemo
{

	public static void main(String[] args) 
	{
		Filtermanager fm1 = new Filtermanager(new Target());
		fm1.setfilter(new Authenticationfilter());
	    fm1.setfilter(new Debugfilter());

		Client c1 = new Client();
		c1.setfiltermanager(fm1);
		c1.sendrequest("Edubridge");
	}

}
