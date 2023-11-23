package com.example.demo.student;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {

            Student mariam = new Student(
                    1L,
                    "Mariana",
                    "mariana.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5), 21


            );


            Student  alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,5),21

            );

            repository.saveAll(
                    List.of(mariam,alex)
            );



        };


    }
}
