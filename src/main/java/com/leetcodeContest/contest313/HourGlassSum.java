package com.leetcodeContest.contest313;

public class HourGlassSum {
    public static void main(String[] args) {
        int [][] grid = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
        int maxSum = maxSum(grid);
        System.out.println(maxSum);
    }

    static int maxSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int maxSum = 0;

        for (int i = 0; i < m - 2; i++){
            for (int j = 0; j < n - 2; j++){
                int sum = hourGlassSum(i,j,grid);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    static int hourGlassSum(int i, int j, int[][] matrix){
        int sum = 0;
        sum += matrix[i][j] + matrix[i][j+1] + matrix[i][j+2];
        sum += matrix[i+1][j+1];
        sum += matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
        return sum;
    }
}
