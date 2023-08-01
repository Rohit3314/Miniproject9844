package com.transfer;
import java.util.*;

public class StudentBO 
{

	List <StudentVO> stud ;
	public StudentBO()
	{
		stud = new ArrayList<StudentVO>();
		StudentVO s1 = new StudentVO(1,"robert");
		StudentVO s2 = new StudentVO(2,"john");
		stud.add(s1);
		stud.add(s2);
	}
	public List<StudentVO> getallstudents()
	{
		return stud;
	}
	
	
}
