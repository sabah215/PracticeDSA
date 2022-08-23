package com.codetal.geeksforgeeks;

public class PeakElement {
    public static void main(String[] args) {
        int [] nums = {1,0,2,3,4,1};
        System.out.println(peakElement(nums, 3));
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int s = 0; int e = n-1;
        int mid =0;
        while(s<=e){
            mid = s+(e-s)/2;

            if((mid == 0 || arr[mid -1] <= arr[mid]) || (mid == n-1 || arr[mid+1] <= arr[mid])){
                return mid;
            }
            if(arr[mid -1] > arr[mid]){
                e = mid-1;
            }
            else{
                s = mid + 1;
            }

        }
        return mid;
    }
}
