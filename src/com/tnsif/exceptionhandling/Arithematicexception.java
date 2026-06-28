package com.tnsif.exceptionhandling;

public class Arithematicexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int no1=50/5;
	        System.out.println(no1);
	        int no2=50/10;
	        System.out.println(no2);
	        
	        try {
	                int no3=50/0;
	        }
	        catch(Exception e) {
	                System.out.println(e);
	        }
	        float no4=70/3;
	        System.out.println(no4);
	}

}
