package com.tnsif.multithreadingprogram;

import com.sun.tools.javac.Main;

public class OrderProcessing implements Runnable
{
	String Ordername;
	OrderProcessing(String Ordername){
		this.Ordername=Ordername;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"started processing"+Ordername);
		
		try {
			Thread.sleep(1000);
			
		}
		catch(Exception e) {}
		System.out.println(Thread.currentThread().getName()+"Completed"+ Ordername);
	}
public static void main(String[] args) {
	OrderProcessing r1 = new OrderProcessing("order 1"); 
	OrderProcessing r2 = new OrderProcessing("order 2"); 
	OrderProcessing r3 = new OrderProcessing("order 3"); 
	
	Thread t1=new Thread(r1,"worker 1");
	Thread t2=new Thread(r2,"worker 2");
	Thread t3=new Thread(r3,"worker 3");
	
	t1.start();
	t2.start();
	t3.start();
	
}
}
