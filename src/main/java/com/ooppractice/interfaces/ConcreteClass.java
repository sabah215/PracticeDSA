package com.ooppractice.interfaces;

public class ConcreteClass implements InterfaceOne{
    @Override
    public void printMethod() {
        System.out.println("This is from printMethod");
    }

    @Override
    public void printMethodTwo() {
        System.out.println("This is from printMethodTwo");
    }


//    public void printMethodThree(){
//        System.out.println("This is from printMethodthree concrete class");
//    }

    public static void main(String[] args) {

//        new ConcreteClass().printMethodThree();
       InterfaceOne.printMethodFour();





    }
}


