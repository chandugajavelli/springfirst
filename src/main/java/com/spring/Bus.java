package com.spring;

public class Bus {


    public Computer com; //by declaring interface obj we can use both laptop and desktop methods here without again changing object by passing the particular class obj ref
    //we need not to modify the object again to use different class obj if we use interface
    public Bus(){
        System.out.println("Objecte Created");
    }
    public void travel(){
        System.out.println("travelling..");
        com.compile();
    }

    
//`@ConstructorProperties({"speed","lap"}) just for sequence
    //  public Bus(Computer com, int speed) {
    //     System.out.println("constructor executed");
    //     this.com = com;
    //     this.speed = speed;
        
    // }



    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }



    int speed;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
   

   

}
