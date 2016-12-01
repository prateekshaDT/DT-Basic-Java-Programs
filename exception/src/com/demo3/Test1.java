package com.demo3;

public class Test1 {
static void chech() throws ArithmeticException
{
	System.out.println("inside check function");
	throw new ArithmeticException("demo");
}
public static void main(String[] args)
{
	try
	{
		chech();
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught" +e);
	}
}
}
