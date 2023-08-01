package com.singleton;

public class Singleobject 
{

   private static Singleobject s = new Singleobject();
   private Singleobject()
   {}
   public static Singleobject getinstance()
   {
	   return s;
   }
   public void showmessage()
   {
	 System.out.println("Hello World");   
   }
   
}
