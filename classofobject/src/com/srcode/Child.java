package com.srcode;

public class Child extends Parent {
	void print()
	{
		System.out.println("hello child");
	}
void display()
{
	super.display();
	System.out.println("hi am overriden method from parent");

	

	}

}
