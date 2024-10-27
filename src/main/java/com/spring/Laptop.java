package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("laptop obj created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using laptop...");
    }
}
