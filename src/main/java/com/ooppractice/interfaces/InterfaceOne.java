package com.ooppractice.interfaces;

public interface InterfaceOne {

    int a = 10; // must be initialized

     int b = 11;

    void printMethod();

    void printMethodTwo();

    default void printMethodThree(){

        System.out.println("This is from printMethodThree");
    }

    static void printMethodFour(){
        System.out.println("This is from printMethodThree from static");
    }

    interface NestedInterface{

        void fromNestedInterface();

    }




}
