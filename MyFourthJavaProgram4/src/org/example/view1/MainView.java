package org.example.view1;
import org.example.model1.Customer;
import org.example.model1.Product;

public class MainView {
	int getCustomerIdFromCustomer(Customer custObj)//method accept customer object
	{
			int custId=custObj.getCustomerId();// calling method
			return custId;
			
	}
	String getCustomerNameFromCustomer(Customer custObj1)
	{
		String custName=custObj1.getCustomerName();
		return custName;
	}
	String getProductNameFromProduct(Product p1)
	{
		String a=p1.getProductName();
		return a;
	}
	
	int setCustomerIdFromCustomer(Customer obj2)
	{
		obj2.setCustomerId(1);
		//int id=obj2.getCustemerId();
		System.out.println("CustomerId="+obj2.setCustomerId());
	}
	
	
      public static void main(String[] args) 
		{
			Customer customer1=new Customer(1,"Samiksha");//object creation
			MainView mainViewObj=new MainView();//class
			MainView mainViewObj1=new MainView();
			
			int custId=mainViewObj.getCustomerIdFromCustomer(customer1); // for print
			System.out.println("The customer id: "+custId);
			
			
			int id=customer1.getCustomerId();
			System.out.println(id);
			
			String custName=mainViewObj1.getCustomerNameFromCustomer(customer1);
		    System.out.println("The customer name :"+custName);
		    
		    String name=customer1.getCustomerName();
		   System.out.println(name);
		   
		   //*********************************************************************************************
		   
		   
		   
		   Product Product1=new Product(11,"xyz",500);
		   MainView v1=new MainView();
		   String a=v1.getProductNameFromProduct(Product1);
		   System.out.println("Product Name : "+a);
		   
		   
		    
		}

}
