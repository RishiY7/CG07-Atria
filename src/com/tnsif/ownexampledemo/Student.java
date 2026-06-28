package com.tnsif.ownexampledemo;

public class Student {

	private String name;
	private int Uid;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Uid=" + Uid + ", age=" + age + "]";
	} 
	
	
	}


