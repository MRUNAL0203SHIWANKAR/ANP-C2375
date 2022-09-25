package org.practicaltest.view.question1;
import org.practicaltest.question1.Employee;
import java.time.LocalDate;
import java.util.Scanner;
import org.practicaltest.question1.Employee;
public class Main
{

public static void main(String[] args)
{ //String LocalDate;
	Employee[] e=new Employee[2];
	Scanner s1=new Scanner(System.in);
	for(int i=0;i<e.length;i++)
	{
	System.out.println("Enter Employee id");
	int a=s1.nextInt();
	s1.nextLine();
	
	System.out.println("Enter Employee name");
	String b=s1.nextLine();
	
	System.out.println("Enter the joining data");
	String returnDateString=s1.nextLine();
    LocalDate l3 = LocalDate.parse(returnDateString);
	System.out.println(l3);
	
	
	Employee e11=new Employee(a,b,l3);
	e[i]=e11;
	}

	for(int i=0;i<e.length;i++)
	{
		System.out.println(e[i]);
		
		
	}
		
	
	
/*Employee e1= new Employee();
Employee e2= new Employee();
Employee e3= new Employee();
Employee e4= new Employee();
Employee e5= new Employee();*/
	
	
}
}
