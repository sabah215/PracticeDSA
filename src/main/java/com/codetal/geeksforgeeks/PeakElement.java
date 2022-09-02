package com.codetal.geeksforgeeks;

public class PeakElement {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(peakLeet(nums));
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int s = 0; int e = n-1;
        int mid =0;

        while(s<=e){
             mid = s+(e-s)/2;

             if((mid == 0 || arr[mid -1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid])){
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

    static int peakLeet(int [] nums){
        int s = 0, e = nums.length-1;

        int m = 0;

        while(s < e){

            m = s + (e - s)/2;

            if(nums[m] < nums[m + 1] )
                s = m + 1;

            else e = m;

        }
        return s;
    }
}
