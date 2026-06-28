package com.tnsif.multithreadingprogram;
// demo for synchronization
public class Example {
	
	synchronized void display() {
		Thread g=Thread.currentThread();
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(3000);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception p) {
				
			}
		}
	}

}
