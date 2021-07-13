package com.mph;

public class User {
	public String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) throws IllegalArgumentException {
		
		if(name.length() > 25)
		{
			throw new IllegalArgumentException("Username is too000000 lonnnnnng");
		}
		/*if(name == null)
		{
			throw new IllegalAccessException("Username cannot be empty");
		}
		else
		{
			if(name.length() < 3)
			{
				throw new IllegalAccessException("Username is too short");
			}
			else if(name.length() > 25)
			{
				throw new IllegalAccessException("Username is too long");
			}
		}*/
		this.name = name;
	}


	public static void main(String[] args) throws IllegalAccessException {
		User u = new User();
		u.setName("joshna");
		System.out.println(u.getName());
	}

}
