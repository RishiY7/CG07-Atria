package com.tnsif.lambdaexpression;

@FunctionalInterface
interface Draw{
        public void draw();
}

public class Withlambdaexample {
public static void main(String[] args) {
        int width=70;
        Draw d=()->{System.out.println("drwaing "+width);};
        d.draw();
}
}

