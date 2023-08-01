package com.factory;

public class Getplanfactory 
{

	public Plan getplan(String s1)
	{
		
		if(s1.equalsIgnoreCase("domestic"))
		{
			return new Domesticplan();
		}
		else
		{
			if(s1.equalsIgnoreCase("commercial"))
			{
				return new Commercialplan();
			}
			else
			{
				if(s1.equalsIgnoreCase("Institutional"))
				{
					return new Institutionalplan();
				}
				else
				{
					return null;
				}
			}
		}
	}
}
