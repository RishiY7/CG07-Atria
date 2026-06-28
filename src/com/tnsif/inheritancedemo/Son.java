package com.tnsif.inheritancedemo;

class Son extends Grandfathee {
    String car = "BMW";

    void showFatherProperty() {
        System.out.println("Father owns a car: " + car);
    }
}

