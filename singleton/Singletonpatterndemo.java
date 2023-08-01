package com.singleton;

public class Singletonpatterndemo
{
	public static void main(String[] args) 
	{
		Singleobject s1 = Singleobject.getinstance();
        s1.showmessage();
	}

}
