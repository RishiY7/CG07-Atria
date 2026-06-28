package com.tnsif.lambdaexpression;

interface Drawable{
    public void draw();
}
class Test implements Drawable{
int width=10;
    @Override
    public void draw() {
    System.out.println("drawing "+width);                
}        
}
public class Withoutlambda {
public static void main(String[] args) {
    Test t=new Test();
    t.draw();
}
}
