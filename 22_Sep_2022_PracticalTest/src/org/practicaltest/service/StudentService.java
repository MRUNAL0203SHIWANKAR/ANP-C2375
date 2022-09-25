package org.practicaltest.service;
import org.practicaltest.dao.StudentDAO;
import org.practicaltest.model.Student;


public class StudentService 
{
	public static boolean AddStudentInfo(Student student)
	{
		boolean result = false;
		StudentDAO.AddStudebtInfo(student);
		return result;
	}
	public static Student[] displayStudentsInfo()
	{
		return StudentDAO.displayStudentInfo();
	}
}
