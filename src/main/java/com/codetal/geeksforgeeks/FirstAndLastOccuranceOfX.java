package com.codetal.geeksforgeeks;

import java.util.ArrayList;

public class FirstAndLastOccuranceOfX {
    public static void main(String[] args) {
        long [] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125};

        System.out.println(find(arr, 5, 5));
    }

    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        list.add(findHelper(arr, n,x, true));
        list.add(findHelper(arr, n,x, false));
        return list;
    }

    static long findHelper(long arr[], int n, int x, boolean isFirst){

        int e = n-1, s=0;
        // holds the value of first and last index
        long ans =  -1;

        while(s <= e && e <= n-1){
            int mid = s + (e - s) / 2;

            if(arr[mid] > x){
                e = mid - 1;
            }else if(arr[mid] < x){
                s= mid + 1;
            }else{
                if(isFirst) {
                    e = mid - 1;
                }
                else {
                    s = mid +1;
                }
                ans = mid;
            }
        }
        return ans;
    }
}
