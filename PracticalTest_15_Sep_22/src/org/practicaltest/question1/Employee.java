package org.practicaltest.question1;

import java.time.LocalDate;

public class Employee 
{public int id;
	public String name;
    public	LocalDate date;
	public String toString()
	{
		return "Model [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	public Employee(int id1, String name1, int date1)
	{	super();
		id = id1;
		name = name1;
		date = date1;
	}
    public Employee()
	{
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id1) {
		id = id1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date1) {
		date = date1;
	}

}
