package com.sncboot.springbootcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class SpringBootExampleApplication{

    public static void main(String[] args){
        SpringApplication.run(SpringBootExampleApplication.class, args);
        System.out.println("Hello World! This is SpringBoot Application!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String username = scanner.nextLine();
        System.out.println("Hi! " + username + "\nWelcome to the SpringBoot World!");
    }
}

