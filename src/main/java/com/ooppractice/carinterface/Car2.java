package com.ooppractice.carinterface;

public class Car2 implements Media{


    @Override
    public void start() {
        System.out.println("Media starts");
    }

    @Override
    public void stop() {
        System.out.println("Media stops");
    }

   

}
