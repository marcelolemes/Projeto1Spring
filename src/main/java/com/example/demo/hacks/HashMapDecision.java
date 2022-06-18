package com.example.demo.hacks;

import org.springframework.web.context.annotation.RequestScope;

import java.util.HashMap;
import java.util.Map;


public class HashMapDecision {

    public HashMapDecision() {

    }
    public static String decision(Integer inteiro){
        Map<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "All");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        return hash_map.getOrDefault(inteiro, "Not Found");
    }

}
