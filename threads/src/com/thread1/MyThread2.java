package com.thread1;

public class MyThread2 implements Runnable{
	public void run()
	{
		System.out.println("hi");
	}
public static void main(String[] args)
{
	MyThread2 obj=new MyThread2();
	Thread t1=new Thread(obj);
	t1.start();
}
}
