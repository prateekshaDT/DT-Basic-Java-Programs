package om.niit.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public void display(List<Integer> l)
	{
		//enhanced for loop
		System.out.println("Usingn Enhanched for loop");
		for(int x : l)
		{
			System.out.println(x);
		}
		
		// Iterator
		
		Iterator<Integer> it=l.iterator();
		
		//traverse the iterator
		System.out.println("Iterator");
		while(it.hasNext())
		{
			int x=it.next();
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		Test t=new Test();
		t.display(l);
	}

}

  
      
   
