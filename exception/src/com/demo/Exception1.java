package com.demo;

public class Exception1 {
	public static double divide(int x,int y)
	{
		double result=0;
		try
		{
			result=x/y;
		}
		catch(Exception ex)
		{
			System.out.println("y value should not be Zero");
		}
		finally
		{
			System.out.println("in finaly block");
		}
		System.out.println("after catch");
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(divide(20,10));
	}
	}
	

