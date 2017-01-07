package com.niit.model;


public class Product {
	private int productId;

private String proName;
private double price;
private String color;

public void setProductId(int productId)
{
    this.productId = productId;
}
public int getProductId()
{
    return productId;
}
 
public void setProName(String proName)
{
    this.proName = proName;
}
public String getProName()
{
    return proName;
}
 
public void setPrice(double price)
{
    this.price = price;
}
public double getPrice()
{
    return price;
}

public void setColor(String color)
{
    this.color = color;
}
public String getColor()
{
    return color;
}
 
}