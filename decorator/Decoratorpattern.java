package com.decorator;

public class Decoratorpattern {

	public static void main(String[] args) 
	{
	
		Shape  c = new Circle();
		Shape r = new Rectangle();
        Shape redcircle = new Redshapedecorator(new Circle());
        Shape redrectangle= new Redshapedecorator(new Rectangle());

	    System.out.println("By normal object");
	    c.draw();
	    System.out.println("By normal object");
	    r.draw();
	    System.out.println("By passing circle object");
	    redcircle.draw();
	    System.out.println("By passing rectangle object");
	    redrectangle.draw();
        
	}

}
