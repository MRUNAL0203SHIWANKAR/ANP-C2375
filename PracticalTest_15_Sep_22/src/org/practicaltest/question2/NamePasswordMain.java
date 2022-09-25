package org.practicaltest.question2;
import java.util.Scanner;
public class NamePasswordMain 
              {
	        
	@Override
		public String toString() {
			return "NamePassword []";
		}

		public static void main(String[] args)
		{ 
			
			NamePassword[] n1=new NamePassword[2]; 
			String name,password ;
			Scanner s1=new Scanner(System.in);
			for(int i=0;i<n1.length;i++)
			{
			System.out.println("Enter user name");
			name=s1.nextLine();
			
			System.out.println("Enter password");
			password=s1.nextLine();
		    int a =password.length();
		    PassWordFormatException p1=new PassWordFormatException();
		    NamePassword u1=new NamePassword ( name,password);
		    n1[i]=u1;
		    
		    if(a<6)
		        throw p1;
		    
		   }
			for(int i=0;i<n1.length;i++)
			{
				System.out.println(n1[i]);
			}
		    
		   
		    
		    
		    
		    
		    
		}

}
