package com.facade;

public class Shapemaker 
{
	private Rectangle r;
	private Circle c;
	private Square s;
	
	public Shapemaker()
	{
	    r = new Rectangle();
	    c = new Circle();
	    s = new Square();
	}
	
	public void drawrectangle()
	{
	    r.draw();	
	}

	public void drawcircle()
	{
		c.draw();
		
	}
	public void drawsquare()
	{
		s.draw();
	}
}
