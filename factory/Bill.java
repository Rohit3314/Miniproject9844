package com.factory;
import java.io.*;
public class Bill 
{
	public static void main(String[] args) throws Exception
	{
		Getplanfactory gpf = new Getplanfactory();
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter plan");
        String name = b.readLine();
        
        System.out.println("Enter units");
		int units = Integer.parseInt(b.readLine());
		
		Plan p = gpf.getplan(name);
		p.getrate();
		p.calculatebill(units);
		
	}

}
