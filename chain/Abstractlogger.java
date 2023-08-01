package com.chain;

public abstract class Abstractlogger 
{
   public static int info=1;
   public static int debug=2;
   public static int error=3;
     
   protected int level;
   protected Abstractlogger nextlogger;
   
   public void setnextlogger(Abstractlogger nextlogger)
   {
	 this.nextlogger = nextlogger;   
   }
   
   public void logmessage(int level, String msg)
   {
	   if(this.level<=level)
		  write(msg);
	   
	   if(nextlogger != null)
	   {
		   nextlogger.logmessage(level, msg);
	   }
   }
  abstract protected void write(String msg);     
}
