package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.Bus;
import com.spring.Computer;
import com.spring.Desktop;
import com.spring.Laptop;

@Configuration
@ComponentScan("com.spring")  //mention if we use component, so spring will scan and maintain classes itself without config file.
public class AppConfig {


//     @Bean
//     public Bus bus(Computer com){ //public Bus bus(@Qualifier("desktop") Computer com){// explicitly using desktop through computer interface
// //no need to mention  @Autowired in new version
//         Bus obj = new Bus();
//         obj.setSpeed(77);
//         obj.setCom(com);//obj.setCom(desktop());but this is tightly coupled so we use interface
//         return obj;
//     }



//    // @Bean(name = {"desk1","desk2","desk3"}) //you can explicitly change name here,also can able to add set of names
//     @Bean
//   //  @Scope("prototype")
//     public Desktop desktop(){ //func name is id/name if u dont specify name in @bean
//         return new Desktop();
//     }

//     @Bean
//     @Primary
//     public Laptop laptop(){
//         return new Laptop();
//     }

}
