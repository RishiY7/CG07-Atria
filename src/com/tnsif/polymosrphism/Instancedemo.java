package com.tnsif.polymosrphism;
class Person1{
}
class Employee extends Person1{
}
class Manager extends Employee{
}
public class Instancedemo {
	public static void main(String[] args) {
		Person1 p=new Person1();
		Employee e=new Employee();
		Manager m=new Manager();
		System.out.println(e instanceof Employee );
		System.out.println(p instanceof Person1);
		System.out.println(e instanceof Manager );
		System.out.println(p instanceof Manager );
		System.out.println(m instanceof Manager );
		System.out.println(m instanceof Person1 );
	}
	}


