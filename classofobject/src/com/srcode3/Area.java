package com.srcode3;
//overloading
public class Area {
	void find(int l,int b)
	{
		System.out.println("Area is"+(l*b));
	}
void find(int l,int b,int h)
{
	System.out.println("Area is"+(l*b*h));
}
public static void main(String[] args)
{
	Area ar=new Area();
	ar.find(8,5);
	ar.find(4,7,2);
}
}
