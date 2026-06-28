package com.tnsif.notifications;

public class Gpay extends Payment{
		void process() {
			System.out.println("processing via gpay");
		}
		void dis() {
			super.process();
			process();
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gpay g = new Gpay();
g.dis();
	}

}
