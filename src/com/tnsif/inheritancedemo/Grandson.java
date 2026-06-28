package com.tnsif.inheritancedemo;

class Grandson extends Son{
	    String bike = "KTM";

	    void showChildProperty() {
	        System.out.println("Child owns a bike: " + bike);
	    }

	    public static void main(String[] args) {
	        Child c = new Child();

	        // Accessing all levels
	        showGrandfatherProperty();  // from Grandfather
	        c.showFatherProperty();       // from Father
	        c.showChildProperty();        // from Child

	        // Accessing variables
	        System.out.println("Land: " + c.land);
	        System.out.println("Car: " + c.car);
	        System.out.println("Bike: " + c.bike);
	    }
	}
