package com.hashmap.implementation;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMapImplementation<String, Integer> customMap = new HashMapImplementation<>();

        customMap.put("Sabah", 88);
        customMap.put("Sarah", 98);
        customMap.put("Abrar", 100);
        customMap.put("Fahim", 95);
        customMap.put("Enayet", 97);

        System.out.println(customMap.toString());

    }
}
