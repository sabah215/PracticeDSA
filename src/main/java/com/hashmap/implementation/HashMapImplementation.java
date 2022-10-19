package com.hashmap.implementation;

import java.util.HashMap;

/**
 * Hashmap contains null value in both key and value.
 * It is similar to HashTable, but it is not synchronized.
 *
 * */

public class HashMapImplementation {
    private int [] nodes = new int[16];
    private int size = 0;
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    static final float LOAD_FACTOR = 0.75f;


    class ListNode {

        private int key;
        private int value;
        private int hashCode;
        ListNode next;

        public ListNode(int key,int value, int hashCode, ListNode next){
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
            this.next = next;
        }

        public int getKey() {
            return key;
        }
        public int getValue() {
            return value;
        }

        public int setValue(int newValue){
            int oldValue = value;
            value = newValue;
            return oldValue;
        }
    }


    public HashMapImplementation(int initialCapacity, float loadfactor){
        // if initial capacity < 0
        // throw IllegalArgumentException
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Initial Cpacity: " + initialCapacity);
        }

        if (initialCapacity > DEFAULT_INITIAL_CAPACITY){

        }

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
