package com.tnsif.polymosrphism;

class Father {
    int a = 9;

    void drink() {
        System.out.println("tea");
    }
}

class Son extends Father {
    @Override
    void drink() {
        System.out.println("old monk");
    }
}

