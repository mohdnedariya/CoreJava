package com.task;

class University 
{
	void universityinfo()
	{
		System.out.println("University: Mumbai University");
	}
}

class College  extends University
{
	void collegeinfo()
	{
		System.out.println("College: Vasantdada Patil College of Engineering");
	}
}

class Department extends College
{
	void departmentinfo()
	{
		System.out.println("Department: Information Technology");
	}
}
