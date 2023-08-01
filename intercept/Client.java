package com.intercept;

public class Client 
{
         Filtermanager fm;
         
         public void setfiltermanager(Filtermanager fm)
         {
        	this.fm = fm; 
         }
	public void sendrequest(String request)
	{
		fm.filterrequest(request);
	}
}
