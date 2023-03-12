package com.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        char c = 256;
//        System.out.println(c);
//        TreeSet t;
//        HashSet h;
//        Collection co;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(6);

        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        HashSet<Integer> ha = new HashSet<>();
        ha.add(9);
        ha.add(7);
        ha.add(6);

        Iterator<Integer> it = ha.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
