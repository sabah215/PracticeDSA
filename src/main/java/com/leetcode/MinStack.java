package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    int [] array;
    private int size = -1;
    private int min = Integer.MAX_VALUE;
    private int indexOfMin = -1;

    public MinStack() {
        array = new int[1000001];
    }


    public static void main(String[] args) {

        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        obj.push(-4);
        for (int i=0; i<= obj.size;i++) {
            System.out.print(obj.array[i] + " ");
        }
        System.out.println();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());

    }

    public void push(int val) {
        array[++size] = val;

        if(val < min){
            min = val;
            indexOfMin = size;
        }
    }

    public void pop() {

        int newMin = Integer.MAX_VALUE;
        int newMinIndex = -1;

        --size;

        for(int i = 0; i <= size; i++){

            if(array[i] < newMin){
                newMin = array[i];
                newMinIndex = i;
            }
        }
        min = newMin;
        indexOfMin = newMinIndex;
    }

    public int top() {
        return array[size];
    }

    public int getMin() {
        for (int i=0;i< size; i++){
            if(array[i] < min)
                min = array[i];
            indexOfMin = i;
        }
        return min;
    }
}
