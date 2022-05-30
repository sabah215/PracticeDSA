package com.ooppractice.carinterface;

public interface Media {

    void start();
    void stop();
    static void pause(){
        System.out.println("Media paused");
    }


}
