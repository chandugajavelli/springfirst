package com.spring;

public class Bus {


    public Laptop lap;
    public Bus(){
        System.out.println("Objecte Created");
    }
    public void travel(){
        System.out.println("travelling..");
        lap.compile();
    }

    

     public Bus(Laptop lap, int speed) {
        System.out.println("constructor executed");
        this.lap = lap;
        this.speed = speed;
        
    }



    int speed;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Laptop getLap() {
        return lap;
    }
    public void setLap(Laptop lap) {
        this.lap = lap;
    }

   

}
