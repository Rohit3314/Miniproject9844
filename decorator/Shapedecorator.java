package com.decorator;

public abstract class Shapedecorator implements Shape
{
	protected Shape decoratedshape;
	
	public Shapedecorator(Shape decoratedshape)
	{
	   	this.decoratedshape = decoratedshape;
	}

	public void draw()
	{
		decoratedshape.draw();
	}
	
}
