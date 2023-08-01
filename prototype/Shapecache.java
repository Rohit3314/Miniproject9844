package com.prototype;
import java.util.*;

public class Shapecache 
{
   private static Hashtable<String,Shape> shapemap = new Hashtable<String,Shape>();
   
   public static Shape getshape(String shapeid)
   {
	   Shape cachedshape = shapemap.get(shapeid);
	   return (Shape) cachedshape.clone();
   }
   public static void loadcache()
   {
	   
	   Circle c1 = new Circle();
	   c1.setId("1");
	   shapemap.put(c1.getId(), c1);
	   
	   Square s1 = new Square();
	   s1.setId("2");
	   shapemap.put(s1.getId(), s1);
	   
	   Rectangle r1 = new Rectangle();
	   r1.setId("3");
       shapemap.put(r1.getId(), r1);
   }
   
   
}
