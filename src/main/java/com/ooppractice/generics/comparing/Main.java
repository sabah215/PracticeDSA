package com.ooppractice.generics.comparing;

import com.ooppractice.generics.GenericInterface;

import java.util.Arrays;

public class Main implements GenericInterface<Integer> {
    public static void main(String[] args) {
        Student sabah = new Student(12,89.76f);
        Student enayet = new Student(11,97.57f);
        Student arpit = new Student(11,95.57f);
        Student karan = new Student(11,77.57f);
        Student sachin = new Student(11,85.57f);

        Student[] list = {sabah, enayet, arpit, karan, sachin};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

        if (sabah.compareTo(enayet) < 0){
            System.out.println("Enayet has more marks");
        }
    }

    @Override
    public void display(Integer value) {

    }
}
