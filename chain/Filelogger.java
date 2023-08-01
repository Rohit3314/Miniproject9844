package com.chain;

public class Filelogger extends Abstractlogger
{
    
	public Filelogger(int level)
	{
	   this.level=level;	
	}
	protected void write(String xyz)
	{
	   System.out.println("File : "+ xyz);	
	}
}
