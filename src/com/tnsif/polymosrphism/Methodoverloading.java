package com.tnsif.polymosrphism;
class calculate{
	int add(int a ,int b) {
		return a+b;
	}
double add(double a , double b) {
	return a+b;
}
int add(int a , int b ,int c) {
	return a+b+c;
	
}
}

public class Methodoverloading {
public static void main(String[] args) {
	calculate b = new calculate();
	System.out.println(b.add(4, 8));
	System.out.println(b.add(5.4,8.5));
	System.out.println(b.add(4,8,8));
}
}
