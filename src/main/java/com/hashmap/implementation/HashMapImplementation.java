package com.hashmap.implementation;

import java.util.HashMap;

/**
 * Hashmap contains null value in both key and value.
 * It is similar to HashTable, but it is not synchronized.
 *
 * */

public class HashMapImplementation {
    private int [] nodes = new int[1000001];

    class ListNode {

        private int key;
        private int value;
        ListNode next;

        public ListNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }


    public HashMapImplementation(){

    }

    public void put(int key, int value){

    }

    public int get(int key){
        int value = 0;
        return value;
    }

    public void remove(int key){

    }



}
