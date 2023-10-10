package web;
import org.joda.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@SpringBootApplication
public class HelloWorld implements CommandLineRunner {
    @Autowired
    JdbcTemplate template;
    public static void main(String[] args){
       SpringApplication.run(HelloWorld.class,args);

    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is : " + currentTime);
    System.out.println("Hello world");
    }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(template);
    try {
      template.execute(
          "CREATE TABLE IF NOT EXISTS products (id SERIAL PRIMARY KEY, name VARCHAR(255), price int)");
    } catch (Exception e) {
      System.out.println("Error Table creating");
      System.out.println(e);
    }

    template.execute("INSERT INTO products( name , price) VALUES ('TONY', 200)");
    template.query(
        "Select * from products",
        (row, res) -> {
          System.out.println(row.getString(2));
          return null;
        });
}


}