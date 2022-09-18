package org.practicaltest.question2;
import java.util.Scanner.*;

	public class NamePassword extends Exception
	{
		public static void main(String[] args)
		{ 
			String name,password = null;
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter user name");
			name=s1.nextLine();
			
			System.out.println("Enter password");
			password=s1.nextLine();
		    int a =password.length();
		    if(a>6)
		    {
		    	System.out.println("Password Is Correct");
		    }
		    try 
		    {
		    	
	        }
			catch(java.util.InputMismatchException)
			{
				System.out.println("Password Format Exception");
			}
			finally
			{System.out.println("Finally");}
			}
	}

}
