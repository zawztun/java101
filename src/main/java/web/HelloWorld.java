package web;
import org.joda.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args){
       SpringApplication.run(HelloWorld.class,args);

    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is : " + currentTime);
    System.out.println("Hello world");
    }
}