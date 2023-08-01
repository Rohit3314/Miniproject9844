package com.transfer;

public class Transferdemo
{

	public static void main(String[] args)
	{
		StudentBO sbo = new StudentBO();
		
		for( StudentVO st : sbo.getallstudents())
		{
		   	System.out.println("Rollno : "+st.getRollno());
		   	System.out.println("Name : "+st.getName());
		}

	}

}
