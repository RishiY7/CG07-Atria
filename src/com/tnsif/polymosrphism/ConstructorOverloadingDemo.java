package com.tnsif.polymosrphism;
//demo for constructor overload
class Student {
    String name;
    int age;

 
    Student() {
        name = "Ranjan";
        age = 69;
    }

    
    Student(String n) {
        name = "Jayanth";
        age = 18;
    }

    
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();              
        Student s2 = new Student("Kushal");     
        Student s3 = new Student("Reddy", 20);  

        s1.display();
        s2.display();
        s3.display();
    }
}