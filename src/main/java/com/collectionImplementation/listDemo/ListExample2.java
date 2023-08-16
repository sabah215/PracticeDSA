package com.collectionImplementation.listDemo;

import java.util.*;

public class ListExample2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("John");
        names.add("Steve");

        ListIterator<String> it= names.listIterator();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("Forward");
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Backward");
        while (it.hasPrevious()){
            System.out.println(it.previous()+" ");
        }
        System.out.println("");
        System.out.println("-----------------------------");
         Map<String, Integer> word = new TreeMap<>();


    }
}
