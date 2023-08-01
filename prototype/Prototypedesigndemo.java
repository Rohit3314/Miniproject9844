package com.prototype;

public class Prototypedesigndemo 
{
	public static void main(String[] args) 
	{
	    Shapecache.loadcache();

	    Shape cl1 = (Shape)Shapecache.getshape("1");
		System.out.println("Shape : "+cl1.getType());
		
		Shape cl2 = (Shape)Shapecache.getshape("2");
		System.out.println("Shape : "+cl2.getType());

		Shape cl3 = (Shape)Shapecache.getshape("3");
		System.out.println("Shape : "+cl3.getType());

	}

}
