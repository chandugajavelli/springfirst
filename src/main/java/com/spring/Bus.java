package com.spring;

public class Bus {

    public Bus(){
        System.out.println("Objecte Created");
    }
    public void travel(){
        System.out.println("travelling..");
    }

     int speed;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    

}
