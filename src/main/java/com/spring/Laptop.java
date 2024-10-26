package com.spring;

public class Laptop implements Computer {
    Laptop(){
        System.out.println("laptop obj created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using laptop...");
    }
}
