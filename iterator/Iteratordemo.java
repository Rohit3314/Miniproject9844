package com.iterator;

public class Iteratordemo
{

	public static void main(String[] args)
	{
		Namerepository ns = new Namerepository();

		for( Iterator it = ns.getiterator(); it.hasnext(); )
		{
		   String name = (String) it.next();
		   System.out.println(name);
		}
	}

}
