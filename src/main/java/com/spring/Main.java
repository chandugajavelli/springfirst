package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext con = new ClassPathXmlApplicationContext("AppContextConfig.xml"); //name of file doesnt matter.
       // object of Bus class in the container will be create upon executing above line when .xml file is called, obj will be created for each bean irrespective of similar class names.
       Bus obj = (Bus) con.getBean("bus"); //can use id "bus" or Bus.class
       // obj.travel();

        Bus obj1 = (Bus) con.getBean("bus");
        obj1.speed= 88;
        System.out.println(obj1.speed);


        Bus obj2 = (Bus) con.getBean("bus");
         //here even we declare another obj, the same obj in container is assigning to both declarations because by default it applies singleton scope i.e, since we have only 1 bean declaration in xml config so 1 obj will be created for a class.
         obj2.speed=70;
        System.out.println(obj2.speed); //object to prototype scope will be created when we declare them but not during ApplicationContext execution like singleton.
            //so 3 objs of bus are created during runtime.

        Bus obj3 = (Bus) con.getBean("bus1"); //setter will be called from config file
        System.out.println(obj3.getSpeed());
        obj3.travel();//reference injection

        Bus obj4 = (Bus) con.getBean("bus2");
        System.out.println(obj4.getSpeed());  //constructor injection
        obj4.travel();
    }
}