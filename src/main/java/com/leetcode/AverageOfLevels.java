package com.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class AverageOfLevels {

    public static void main(String[] args) {

    }

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> averages = new ArrayList<>();
        double sum =0;
        if(root.left == null)
            sum+=0;
        return averages;
    }
}

