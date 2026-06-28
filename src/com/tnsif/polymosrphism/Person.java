package com.tnsif.polymosrphism;

 class Thismain {
	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

public void display() {
	System.out.println("name:"+name);
}
 }
public class Person{
	public static void main(String[] args) {
		Thismain p = new Thismain() ;
		p.setName("alia bhatt");
		p.getName();
		p.display();
		
		
	}
	}

