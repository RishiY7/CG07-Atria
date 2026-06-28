package com.tnsif.notifications;

public class Pushnotification extends Notification {
	String mes="push notification";
	
	void display() {
		super.showGrand();
		System.out.println("child"+mes);
		System.out.println("Parent"+mes);
		
	}
	public static void main(String[] args) {
		Pushnotification p = new Pushnotification();
		
		p.display();
	}
	

}
