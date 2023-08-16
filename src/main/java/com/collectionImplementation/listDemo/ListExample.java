package com.collectionImplementation.listDemo;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("John");
        names.add("Steve");
        System.out.println("-----------------------------");
        System.out.println("Iterating list using foreach loop:");
        for (String name: names)
        {
            System.out.println(name+" ");
        }

        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Iterating List using for loop");
        for(int i=0; i < names.size(); i++){
            System.out.println(names.get(i)+" ");
        }
        System.out.println("");
        System.out.println("-----------------------------");
    }
}
