package com.demo2;

public class Test {
static void avg()
{
	try
	{
		throw new ArithmeticException("demo");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception caught");
	}
	}
public static void main(String[] args)
{
	avg();
}
}
