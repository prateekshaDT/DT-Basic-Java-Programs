package com.srcode2;
public class RunEncap extends EncapTest {
	public static void main(String[] args)
	{
		EncapTest encap=new EncapTest();
		encap.setName("abc");
		encap.setIdno("77a");
		encap.setAge(21);
		//System.out.println("name :" + encap.getName());
		System.out.println(encap);
	}

}
