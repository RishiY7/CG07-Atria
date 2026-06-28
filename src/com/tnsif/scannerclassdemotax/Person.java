package com.tnsif.scannerclassdemotax;
//finding the tax 
public class Person {

	private String name;
	private int income;
	private int Tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return Tax;
	}
	public void setTax(int tax) {
		Tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", Tax=" + Tax + "]";
	}
	
	//getters and setters 
}


	