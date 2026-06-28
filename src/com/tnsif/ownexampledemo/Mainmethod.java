package com.tnsif.ownexampledemo;
import java.util.Scanner;

public class Mainmethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student name");
		String name=sc.next();
		System.out.println("enter the age");
		int income =sc.nextInt();
		
		Student pp = new Student();
		pp.setName(name);
		pp.set(income);
		 
		Taxcalculation t = new Taxcalculation();
		t.CalculateTax(pp);
		
		System.out.println("after tax calculation");
		
		System.out.println(pp);

}
