package com.codetal.geeksforgeeks;


public class SumOfBinaryTree {
    public static void main(String[] args) {

    }
    static int sumBT(Node head){
        //Code
        if(head != null) return 0;
        return head.data + (head.left != null ? sumBT(head.left) : 0) +
                (head.right != null ? sumBT(head.right) : 0);
    }
}
