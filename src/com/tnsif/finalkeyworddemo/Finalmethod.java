package com.tnsif.finalkeyworddemo;
//final class cannot be overidden
//if v put final keywoord to class thn v cannot inherit amazon class 
//if v apply final keyword to calculate thn the other cacl wont work
 class Ecommerceplatform{
	 void calculate() {
		System.out.println("base discount 10%");
		
	}
}
class Amazon extends Ecommerceplatform{
	@Override
	void calculate() {
		System.out.println("Base discount 20%");
		
	}
}
public class Finalmethod {
	public static void main(String[] args) {
		Amazon A =new Amazon();
		A.calculate();
	}

}
