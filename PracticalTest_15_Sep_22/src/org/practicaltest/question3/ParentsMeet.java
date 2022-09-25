package org.practicaltest.question3;

import java.util.Scanner;

import Scanner.
public class ParentsMeet 
{
	int rollno;
	String name;
	private String rollNo;
public void  parentsMeet()
{
	rollno=1;
	name="ABC";
}
 public void parentsMeet(int r,String n)//CONSTRUCTOR OVERLOADING
{
	rollno=r;
	name=n;
}
void parentsMeet(int r)//CONSTRUCTOR OVERLOADING
{
	System.out.println("Today Absent");
}


public int  get()
{
	return rollno;
}
public void set(int r)
{
	rollno=r;
}
public String getname()
{
	return name;
}
public void setname(String n)
{
	name=n;
}
public void Dance(String name)//Method Ovreloading
{
	System.out.println("Take part in Dance Compition");
}

class Dance//NEW CLASS
{
	public void Dance(String name)//METHOD OVERLOADING
{
	System.out.println("Welcome to Dance Compition");
}
}
abstract class Principal//ABSTRACT CLASS
{
	abstract void PrincipalName();
}
 class Demand extends Principal
{
	void PrincipalName()
	{
	System.out.println("Demands");
    }
}
interface ClassTeacher//Interface
{
	void Name();
}
class TeacherName1 implements ClassTeacher
{
	public void Name()
	{
		System.out.println("TRIVENI MAM");
	}
}
//class Demo
//{
public static void main(String[] args)
{
	
	ParentsMeet p1= new ParentsMeet();
	ParentsMeet p2= new ParentsMeet();
	
	
	



}
}