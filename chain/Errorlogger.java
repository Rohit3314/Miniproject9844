package com.chain;

public class Errorlogger extends Abstractlogger
{
   public Errorlogger(int level)
   {
	   this.level=level;
   }
   
   protected void write(String pqr)
	{
	   System.out.println("Error : "+ pqr);	
	}
}
