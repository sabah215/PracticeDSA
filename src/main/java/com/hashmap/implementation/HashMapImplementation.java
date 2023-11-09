package com.hashmap.implementation;

import java.util.*;

/**
 * Hashmap contains null value in both key and value.
 * It is similar to HashTable, but it is not synchronized.
 *
 * */

public class HashMapImplementation<K, V> {

    private class Node  {
        K key;
        V value;

        public Node (K key, V value){
            this.key=key;
            this.value = value;
        }
    }

    private int n = 0; // no. of nodes
    private int N; // no. of buckets

    private LinkedList<Node> [] buckets;

    public HashMapImplementation(){
        this.N = 4;
        this.buckets = new LinkedList [N];
        for(int i = 0; i < buckets.length; i++){
            this.buckets[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value){
        int bi = getHash(key);
        int ni = searchInLL(key, bi);

        if(ni == -1){
           buckets[bi].add(new Node(key, value));
           n++;
        }

        else {
            Node node = buckets[bi].get(ni);
            node.value = value;
        }

        double lambda = (double) n/N;
        if(lambda > 2.0){
            rehash();
        }
    }

    public V get(K key){
        int bi = getHash(key);
        int ni = searchInLL(key, bi);
        if(ni == -1){
            return null;
        }
        Node node = buckets[bi].get(ni);
        return node.value;
    }

    public boolean containsKey(K key){
        int bi = getHash(key);
        int ni = searchInLL(key, bi);
        if(ni == -1){
            return false;
        }
        return true;
    }
    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for (LinkedList<Node> ll : buckets){
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                keys.add(node.key);
            }
        }
        return keys;
    }

    public V remove(K key){
        int bi = getHash(key);
        int ni = searchInLL(key, bi);
        if(ni == -1){
            return null;
        }
        else {
            Node node = buckets[bi].remove(ni);
            n--;
            return node.value;
        }
    }
    public boolean isEmpty(){
        return n == 0;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (LinkedList<Node> ll : buckets){
            for (Node node: ll ){
                sb.append(node.key);
                sb.append(" = ");
                sb.append(node.value);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private int getHash(K key){
        int index = Math.abs(key.hashCode()) % N;
        return index;
    }

    private int searchInLL(K key, int bi){
        LinkedList<Node> ll = buckets[bi];
        for(int i = 0; i < ll.size(); i++){
            Node node = ll.get(i);
            if(node.key.equals(key)){
                return i;
            }
        }
        return -1;
    }

    private void rehash(){
        LinkedList<Node> [] oldList = buckets;
        buckets = new LinkedList[2*N];
        for (int i = 0; i< buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < oldList.length; i++){
            LinkedList<Node> ll = oldList[i];
            for (int j=0; j<ll.size(); j++){
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
    }
}
