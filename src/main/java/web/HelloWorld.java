package web;
import org.joda.time.LocalTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld implements CommandLineRunner {
    public static void main(String[] args){
       SpringApplication.run(HelloWorld.class,args);

    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is : " + currentTime);
    System.out.println("Hello world");
    }
  @Override
  public void run(String... args) throws Exception {

}


}