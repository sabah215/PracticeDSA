package com.hashmap.implementation;

import java.util.HashMap;

/**
 * Hashmap contains null value in both key and value.
 * It is similar to HashTable, but it is not synchronized.
 *
 * */

public class HashMapImplementation {
    private ListNode [] nodes ;
    private int size = 0;
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 2;
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


    public HashMapImplementation(){
        // if initial capacity < 0
        // throw IllegalArgumentException
        nodes = new ListNode[DEFAULT_INITIAL_CAPACITY];
    }

    public void put(int key, int value){


        int hash = key % nodes.length;
        ListNode node = new ListNode(key, value,hash, null);

        if(nodes[hash] == null){
           nodes[hash] = node;
        }

        else{
            ListNode temp = nodes[hash];
            while (temp.next != null){
                if (temp.next == null)
                    temp.next = node;
                temp = temp.next;
            }
         }

        return;
    }

    public int get(int key){
        int value = 0;
        return value;
    }

    public void remove(int key){

    }



}
