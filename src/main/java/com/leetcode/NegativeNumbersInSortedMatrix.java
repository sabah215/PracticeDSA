package com.leetcode;

public class NegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        int negatives = 0;
        int m = grid.length, n= grid[0].length, c=0;
        int r = m-1;
        while(r >= 0 && c < n){
           if(grid[r][c] < 0){
               r--;
               negatives += n - c;
           }
           else{
               c++;
           }
        }
        return negatives;
    }

}
