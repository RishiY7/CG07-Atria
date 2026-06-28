package com.tnsif.inheritancedemo;

public class Child  extends Father{
	String cycle="red";
	void read() {
		System.out.println("java");
	}
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.money);
		System.out.println(c.car);
		System.out.println(c.cycle);
		c.drink();
	}

}
