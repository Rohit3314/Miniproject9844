package com.chain;

public class Consolelogger extends Abstractlogger 
{

	public Consolelogger(int level)
	{
		this.level=level;
	}
	protected void write(String abc)
	{
	   System.out.println("console : "+ abc);	
	}
}
