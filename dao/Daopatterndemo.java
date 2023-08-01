package com.dao;

public class Daopatterndemo
{

	public static void main(String[] args) 
	{
		StudentDaoImpl d = new StudentDaoImpl();

		for(Student s : d.getallstudents())
		{
		   	System.out.println("Roll no : "+s.getRollno());
		    System.out.println("Name : "+ s.getName());
		}
	}

}
