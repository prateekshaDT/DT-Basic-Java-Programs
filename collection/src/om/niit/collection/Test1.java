package om.niit.collection;

import java.util.List;

import java.util.Vector;


public class Test1 {
	public void display(List<Integer> l)
	{
		System.out.println("Using Enhanced for loop");
		for(int x : l)
		{
			System.out.println(x);
		}
	}
	public void displayBook(Book b)
	
	{
		System.out.println("ID:"+b.getId());
		System.out.println("Name:"+b.getName());
		System.out.println("price:"+b.getPrice());
	}
	
	public void displayAll(List<Book> books)
	{
		for(Book b:books)
		{
			
		displayBook(b);	
		}
	}
	public void search(List<Book> books,int id)
	{
		for(Book b:books)
		{
		if(b.getId() == id)
		{
			System.out.println("Book is available");
			displayBook(b);
			return;
		}
		}
			System.out.println("the book is not available");
		}
	public static void main(String[] args) {
		Book book;
		List<Book> books = new Vector<Book>();
		book = new Book(101,"java",200);
		books.add(book);

		book = new Book(102,"Spring",300);
		books.add(book);
		
		book = new Book(103,"css",400);
		books.add(book);
		
		book = new Book(104,"html",500);
		books.add(book); 
		
		Test1 t=new Test1();
		t.displayAll(books);
		t.search(books,104);
	}
		
	}


