package org.practicaltest.main;
//import org.practicaltest.dao.Student
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import org.practicaltest.dao.StudentDAO;
import org.practicaltest.model.Student;
import org.practicaltest.view.StudentView;

public class StudentMain 
{
		private static final Student Student = null;
		static Scanner p1=new Scanner(System.in);
		static void displaySubMenu()
		{
			System.out.println("1. Add Student Info");
			System.out.println("2.Display Student Info");
			System.out.println("Enter your Choice");
			int Choice=p1.nextInt();
			switch(Choice)
			{
			case 1:
				if(StudentView.AddStudentInfo());//here user store value`
				     System.out.println("1. StudentInfo Added Succeefully");
				       break;
			case 2:
				      //Student[] student=(Student[])StudentView.displayStudentsInfo();
				//Iterator<Student>i1=h1.iterator();
				//for(Student stu:student)
				//{
				if(StudentDAO.AddStudentInfo(Student));
				//{
				//HashSet <Student> h1=new HashSet<Student>();
				//h1.add(stu1);
			    //System.out.println(h1);
				
			
			      	HashSet <Student> h1=new HashSet<Student>();
			      	h1.add(Student);
						if(h1!=null);
						System.out.println(h1);
			//Iterator<Student>i1=h1.iterator();
				//while(i1.hasNext())
					//System.out.println(i1.next());
				//return true;
				//}
				
			
				break;
					default:
						System.out.println("Not a valid Input");
				}
			}
		public static void main(String[] args)
		{
			int choice;
			do
			{
				System.out.println("1. Start Applicaion");
				System.out.println("2.Stop Application");
				System.out.println("Enter our Choice");
				choice=p1.nextInt();
				
				switch(choice)
				{
				case 1:
					displaySubMenu();
					break;
				case 2:
					System.exit(0);
					break;
					default:
						System.out.println("Not a valid input");
				}
			}
			while(true);		
	}
}
