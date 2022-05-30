package com.ooppractice.generics;

import java.util.Arrays;
import java.util.List;

//here Number can be either Number or any subclasses of NUmber class
public class WildcardExample<T extends Number> {
    private Object [] data;
    private static int DEFAULT_SIZE = 10;

    // size refers to how many values are inserted.
    //If size == data.length, then arrayList is full it needs to be resized.
    private int size = 0;

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    // Syntax to declare Wildcard: It means Values of type Number or any
    // type of subclass of Number is allowed.
    // public void getList(List<Number> list){} Here no type of subclass is allowed
    public void getList(List<? extends Number> list){
        //do something
    }

    private void resize() {
        Object [] temp = new Object[data.length * 2];

        //copy the current items to the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        CustomArrayList list = new CustomArrayList();
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }
}
