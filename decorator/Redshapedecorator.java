package com.decorator;

public class Redshapedecorator extends Shapedecorator
{

	public Redshapedecorator(Shape decoratedshape)
	{
		super(decoratedshape);
	}
	
	public void draw()
	{
		decoratedshape.draw();
	}
}
