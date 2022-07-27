package com.recursion.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccuranceOfX {

    public static void main(String[] args) {
        int [] arr = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        int n = arr.length;
        List<Integer> a1 = find(arr, n, 5);

        System.out.println(a1.get(0) +" "+a1.get(1));

    }

    public static ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here

        int l = 0, h = n-1;
        int first = -1, last = -1;
        ArrayList<Integer> indices = new ArrayList<>();
        while(l <= h){
            int mid = l+(h-l)/2;

            if(arr[mid] < x){
                l = mid+1;
            }
            else if(arr[mid] > x){
                h = mid-1;
            }
            else{
                first = mid;
                h = mid-1;
            }
        }
        l = 0; h = n-1;
        while(l <= h){
            int mid = l+(h-l)/2;

            if(arr[mid] < x){
                l = mid+1;
            }
            else if(arr[mid] > x){
                h = mid-1;
            }
            else{
                last = mid;
                l = mid+1;
            }
        }
        indices.add(first);
        indices.add(last);

        return indices;
    }
}
