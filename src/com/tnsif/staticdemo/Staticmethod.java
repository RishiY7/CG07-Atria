package com.tnsif.staticdemo;
//demo for static method
class Paymentgateway{
	static void shownotification() {
		System.out.println("Supported Bank: sbi, hdfc,.....");
	}
}




public class Staticmethod {
	public static void main(String[] args) {
		Paymentgateway.shownotification();
	}

}
