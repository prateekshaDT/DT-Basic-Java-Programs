package com.clintdemo4;

public class B extends A {
	void callme()
	{
		super.callme();
		System.out.println("this is callme");
	}
	public static void main(String[] args)
	{
		try{
		B b=new B();
		Integer a=new Integer(5);
		System.out.println(" "+a.getClass());
		System.out.println(" "+b.getClass());
		System.out.println("before finalize");
		b.callme();
		System.out.println("finalizing..");
		b.finalize();
		System.out.println("finalized");

		}catch (Throwable ex) {
			   ex.printStackTrace();
		   }
		
	}

}

