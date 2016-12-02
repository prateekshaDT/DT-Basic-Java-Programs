package com.collection;
import java.util.*;
public class TestCollection {

	
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("hari");
		a.add("prathi");
		a.add("ammu");
		a.add("naveen");
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
     
	}

}
