package com.tnsif.constructordemo;

public class Conexample {

	Conexample(){
		System.out.println("Default con");
	}
	Conexample(int a ,String b){
	System.out.println("2 parameter");
	}
	Conexample (int r )
	{
		System.out.println("1 para");
	}
	Conexample(int s , int b , int d ){
		System.out.println("3 para");
	}
	public static void main(String[] args) {
		Conexample c = new Conexample();
		Conexample c1 = new Conexample(1, "kushal");
		Conexample c2 = new Conexample(6,7,7);
		Conexample c3 = new Conexample(1);

	}

}
