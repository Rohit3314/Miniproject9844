package com.facade;

public class Facadedemo 
{

	public static void main(String[] args)
	{
		Shapemaker s1 = new Shapemaker();
		s1.drawrectangle();
		s1.drawcircle();
        s1.drawsquare();
	}

}
