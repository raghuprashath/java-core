package com.learning.core.day10;

public class ValidateUser extends User{
	public boolean  checkname(String name) throws nameException
	{
		if(name.isBlank()==false)
		{
			return true;
		}
		else
		{
			throw new nameException();
		}
	}
	public boolean  checkadd(String add) throws addressException
	{
		if(add.isBlank()==false)
		{
			return true;
		}
		else
		{
			throw new addressException();
		}
	}

}