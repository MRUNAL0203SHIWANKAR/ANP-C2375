

package org.practicaltest.dao;
import org.practicaltest.model.Student;
import org.practicaltest.view.StudentView;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentDAO
{

	
	
	public static boolean AddStudentInfo(Student stu)
	{
		boolean result = false;
      	HashSet <Student> h1=new HashSet<Student>();
			h1.add(stu);
			System.out.println(h1);
		  
		
	
	Iterator<Student>i1=h1.iterator();
	while(i1.hasNext())
		System.out.println(i1.next());
	return true;
	}
	public static Student[] displayStudentInfo()
	{
		Student[] t1 = null;
		return t1;
	}
		
}
	//Integer [] s1=new Integer[10];
	
	/*for(Integer n:s1)
	{
		TreeSet <Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(n);
		
	}
	return result;
	}*/
		
		/*String[] s1=new String[10];
		
		for(String n:s1)
		{
			TreeSet <String> treeSet=new TreeSet<String>();
			treeSet.add("n");
			
		}
		return result;
		}*/

	
