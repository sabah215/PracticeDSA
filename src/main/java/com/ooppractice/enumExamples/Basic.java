package com.ooppractice.enumExamples;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
        //these are known as enum constant
        //by deafault the are public static final
        // since it is final so you cannot create child
        // type is Week

        Week(){
            System.out.println("Constructor called for this " + this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
