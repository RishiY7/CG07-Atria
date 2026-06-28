package com.tnsif.encapsulationdemo;
class Human1 {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulationprogram {

	public static void main(String[] args) {
		Human1 h=new Human1();
		h.setAge(69);
		h.setName("H Ranjan");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
		h.setAge(25);
		h.setName("Jayanth");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());

	}



	}

