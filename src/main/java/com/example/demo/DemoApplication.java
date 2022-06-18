package com.example.demo;

import com.example.demo.hacks.HashMapDecision;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {


    static HashMapDecision hashMapDecision;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        hashMapDecision = new HashMapDecision();
        System.out.println(hashMapDecision.decision(21));


    }

}
