package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Carle", 1, 19);


        SpringApplication.run(Main.class, args);
        System.out.println("Serveur lancé sur http://localhost:8080");
    }
}
