package com.tnsif.scannerclassdemotax;
import java.util.Scanner;
public class Mainmethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the person name");
		String name=sc.next();
		System.out.println("enter the income");
		int income =sc.nextInt();
		
		Person pp = new Person();
		pp.setName(name);
		pp.setIncome(income);
		 
		Taxcalculation t = new Taxcalculation();
		t.CalculateTax(pp);
		
		System.out.println("after tax calculation");
		
		System.out.println(pp);
	}

}
