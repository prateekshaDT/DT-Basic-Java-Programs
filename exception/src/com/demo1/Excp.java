package com.demo1;

public class Excp {
	public static void main(String[] args)
	{
		int a,b,c;
		try
		{
			a=0;
			b=10;
			c=b/a;
			System.out.println("this line will not be excuted");
		}
		catch(ArithmeticException e)
		{
			System.out.println("divided by zero");
		}
		System.out.println("After exception is handled");
	}

}


