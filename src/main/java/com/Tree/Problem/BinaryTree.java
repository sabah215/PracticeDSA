package com.Tree.Problem;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}
        TreeNode(int val){ this.val =val; }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val =val;
            this.left = left;
            this.right = right;
        }
    }

    public BinaryTree(){ root = null; }

    public BinaryTree(int data){ root = new TreeNode(data);  }

    TreeNode root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(4);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(9);
//        tree.insert(20);
//        tree.insert(1);
        tree.inOrder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
    //BFS / Level order traversal
    public void levelOrder(TreeNode node){
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null){

        }
        return;
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
        return;
    }

    public void preorder(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
        return;
    }

    public void postOrder(TreeNode root){
        if(root != null){
//            System.out.print(root.data + " ");
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
        return;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }
    private TreeNode insertRec(TreeNode root, int data){
        // check for empty tree
        // if true then set the value to the root node
        if (root == null){
            root = new TreeNode(data);
            return root;
        }
        // insert in left subtree
        if(data <= root.val)
            root.left = insertRec(root.left, data);

        else if(data > root.val)
            root.right = insertRec(root.right, data);
        return root;
    }

    public static int isBST(TreeNode root){
        int isBST = 0;
        return isBST;
    }
}
