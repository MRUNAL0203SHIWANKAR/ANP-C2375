package org.example.model1;

public class Product {
	private int ProductId;
	private String ProductName;
	private int Price;
    public Product() 
	{
	}
    public Product(int id,String name,int p)
	{
		ProductId=id;
		ProductName=name;
		Price=p;
	}
    public int getProductId()
	{
		return ProductId;
	}
	public void setProductId(int id)
	{
		ProductId=id;
	}
	public String getProductName()
	{
		return ProductName;
	}
	public void setProductName(String name)
	{
		ProductName=name;
	}
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int p)
	{
		Price=p;
	}

}
