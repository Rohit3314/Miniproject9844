package com.prototype;

public class Circle extends Shape 
{
    Circle()
    {
    	type="Circle";
    }
	@Override
	void draw() 
	{
	   System.out.println("Inside circle : draw method");
		
	}

}
