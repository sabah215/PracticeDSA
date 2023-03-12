package com.collectionImplementation.arrayList;

public class ArrayListImplementation {

    private int [] arr;
    private int i = 0;
    private static int DEFAULT_SIZE = 10;

    public ArrayListImplementation(){
        this.arr = new int[DEFAULT_SIZE];
    }
    public ArrayListImplementation(int initialCapacity){
        this.arr = new int[initialCapacity];
    }

    public void addElement(int e){
        if(i == arr.length){
            int size = ((3/2)* arr.length) +1;
            int [] newArr = new int [size];

            for (int j=0; j< arr.length; j++){
                newArr[j] = arr[j];
            }
            newArr[i] = e;
            arr = newArr;
        }
        else{
            arr[i]=e;
        }
        i++;
    }

    public void printArray(){
        for (int k=0;k < i; k++){
            System.out.println(arr[k]);
        }
    }

}
