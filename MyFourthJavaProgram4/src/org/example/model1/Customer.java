package org.example.model1;
public class Customer 
{
	private int customerId;
	private String customerName;
	private String productName;
	
	public Customer()
	{
	} 
  public Customer (int id,String name)//constructor with parameter
	{
		customerId = id;
		customerName=name;
	}
	
	public int getCustomerId()//defining method
	{
		return  customerId;
	}
	public void setCustomerId(int id)//parameter with datatype
	{
	      customerId=customerId;
	}
	public String getCustomerName()
	{
		return customerName;
    }
	public void setCustomerName(String name)
	{
		customerName=customerName;
	}
	
}
