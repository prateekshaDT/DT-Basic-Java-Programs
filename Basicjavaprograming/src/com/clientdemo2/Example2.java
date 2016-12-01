package com.clientdemo2;
import java.util.*;
public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt(10);
		EvenOdd2 obj=new EvenOdd2();
		boolean b=obj.EvenOdd2(num);
		if(b==true)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
