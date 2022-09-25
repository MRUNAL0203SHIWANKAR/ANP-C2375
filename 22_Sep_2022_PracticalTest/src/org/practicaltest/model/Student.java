package org.practicaltest.model;
public  class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;

	public Student()
	{
		rollNo=1;
		name="XYZ";
	}
	public Student(int r,String n)
	{
		rollNo=r;
		name=n;
	}
	
	public int getRno()
	{
		return rollNo;
	}
	public void setRno(int r1) 
	{
		rollNo=r1;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n1)
	{
		name=n1;
	}
	
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
    @Override
	public int compareTo(Student ooo) {
    	int val=0;
    	if(this.rollNo==ooo.name)
    		val=0;
    	else
    		val=this.rollNo > ooo.name?1:-1;
		// TODO Auto-generated method stub
		return val;
	}
	
	

}
