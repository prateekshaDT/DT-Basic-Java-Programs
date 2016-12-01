package com.camparable;
public class Student3 implements Comparable<Student3>{
	int rollno;
	String name;
	int age;
	Student3(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
	
		return 0;
	}
	}