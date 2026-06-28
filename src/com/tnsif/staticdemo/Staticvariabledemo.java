package com.tnsif.staticdemo;
//demo for static variable
class Student{
	String name;
	int id;
	static String collegename="Atria";
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	void showdetails() {
		System.out.println("Student: " + name +" id: " + id + " college name: "+ collegename);
	}
	
}
public class Staticvariabledemo {
	public static void main(String[] args) {
		Student s1 = new Student("Jayanth",1);
		Student s2 = new Student("Ranjan",6);
		Student s3 = new Student("Prajwal",9);
		Student s4 = new Student("Pavan",10);
		
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
		s4.showdetails();
		

		
		
		
	}

}
