package org.anudip.smp.view3;
import org.anudip.smp.model3.Student3;
public class StudentView3 {
public static void main(String[] args) {
	Student3 studentObj1; 
	studentObj1=new Student3();
	
	Student3 studentObj2=new Student3();
	
	Student3 studentObj3=new Student3(2,'B',23);
	
		char name=studentObj3.getStudentName();// calling method // arguments
	System.out.println("studentObj3 "+name);
	System.out.println("studentObj1 name "+studentObj1.getStudentName());
	
	studentObj3.setStudentName('C');
	name=studentObj3.getStudentName();// calling method // arguments
	System.out.println("studentObj3 "+name);
	
	
	
}
}

