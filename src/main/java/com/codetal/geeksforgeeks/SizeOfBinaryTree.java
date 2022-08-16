package com.codetal.geeksforgeeks;

class Node{
   int data;
   Node left;
   Node right;
   Node(int data){
       this.data = data;
       left = null;
       right = null;
   }
}
public class SizeOfBinaryTree {
    public static void main(String[] args) {

    }
    public static int getSize(Node root)
    {
        if(root == null)
            return 0;
        else return 1 + (getSize(root.left)) + getSize(root.right);
    }
}
