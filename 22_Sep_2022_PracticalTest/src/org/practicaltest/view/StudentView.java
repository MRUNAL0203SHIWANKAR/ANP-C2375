package org.practicaltest.view;
import org.practicaltest.dao.StudentDAO;
import java.util.Iterator;
import java.util.Scanner;

import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;


public class StudentView 
{
	//private static final String h1 = null;
	static Scanner s1=new Scanner(System.in);
	public static boolean AddStudentInfo()
	{
		for(int i=0;i<2;i++)
		{
			
		
		System.out.println("Enter Student Information");
		System.out.println("Enter Student Roll No");
		int r1=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter Student Name");
		String n1=s1.nextLine();
		
		
		
		/*Iterator<Integer>i1=h1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());*/
		
		
		
		//Student student=new Student(r1,n1);
		//StudentService.AddStudentInfo(student);
		//}
		}
		return true;
	}
	
	public static Student[] displayStudentsInfo()
	{
		return StudentService.displayStudentsInfo();
	}
	

}
