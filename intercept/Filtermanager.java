package com.intercept;

public class Filtermanager
{
       Filterchain fchain;
       
       public Filtermanager(Target t)
       {
    	   fchain = new Filterchain();
    	   fchain.settarget(t);
       }
      public void setfilter(Filter f4)
      {
    	  fchain.addfilter(f4);
      }
      public void filterrequest(String request)
      {
    	fchain.execute(request);  
      }
      
}
