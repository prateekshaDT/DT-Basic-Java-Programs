package com.srcode2;
// encapsulation
public class EncapTest {
	private String name;
	private String idno;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getIdno() {
		return idno;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}


public String toString(){
	return name+" "+idno+" "+age;
}
}