package com.Tree.Implementation;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    class Node{
        // stores data
        private int data;
        // stores the address of left child
        private Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public BinaryTree(){ root = null; }

    public BinaryTree(int data){ root = new Node(data);  }

    // Breadth First Search: Level Order Traversal
//    public List<List<Integer>> levelOrderTraversal(Node root){
////        if(root == null) return l;
//        Queue<Node> queue = new ArrayDeque<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            Node current = queue.remove();
//            System.out.print(current.data + " ");
//            if(current.left != null) queue.add(root.left);
//            if (current.right !=null) queue.add(root.right);
//        }
//
//
//    }

    public void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        return;
    }

    // Depth First Search: Inorder
    // Time Complexity O(n)
    // Space Complexity O(h) h is the height of the tree
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        return;
    }

    public void postorder(Node root){
        if(root != null){
//            System.out.print(root.data + " ");
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        return;
    }

    public int getHeight(Node root){
        if (root == null) return -1;
        return Math.max(getHeight(root.left),getHeight(root.right) + 1);
    }

    public boolean isBST(Node root){
        boolean isBst = false;
        return isBst;
    }
    public Node deleteNode(Node root, int data){
        //corner case
        // root == null return root;
        //else if data < root
            //delete(root.left, data)
        //else if(data > root)
            //delete(root.right, data)
            // case 1: No child node
            //case 2: 1 child node
            //case 3: 2 children node
        return root;
    }

    public int getNumberOfNodes(Node root){
        int sum = 0;
        int nodes = countNodes(root, sum);

        return nodes;
    }
    public  int countNodes(Node root, int sum){
        if (root == null)
            return 0;
        return (getNumberOfNodes(root.left) + getNumberOfNodes(root.right)) + 1;
    }

    public int getMin(Node root) {
        if(root == null)
            return -1;
        else if(root.left == null)
            return root.data;
        return getMin(root.left);
    }

    public int getMaxIteratively(Node root){
        if(root == null)
            return -1;

        while(root.right != null){
                root = root.right;
            }
        return  root.data;
    }

    public int getMinIteratively(Node root){
        if(root == null)
            return -1;
        while(root.left != null){
            root = root.left;
        }
        return  root.data;
    }

    public int getMax(Node root){
        if(root == null)
            return -1;
        else if (root.right == null)
            return root.data;
        return getMax(root.right);
    }

    public void insert(int data){
        root = insertRec(root, data);
    }
    private Node insertRec(Node root, int data){
        // check for empty tree
        // if true then set the value to the root node
        if (root == null){
            root = new Node(data);
            return root;
        }
        // insert in left subtree
        if(data <= root.data)
            root.left = insertRec(root.left, data);

        else if(data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }

    public void remove(int data){
        root = removeRec(root,data);
        System.out.println(root.data + " removed");
    }
    public Node removeRec(Node root, int data){
        // Base case : if root == null
        if (root == null)
            return root;
        else if(data < root.data)
            return removeRec(root.left, data);
        else if(data > root.data)
            return removeRec(root.right, data);
        return root;
    }

    public boolean search(Node root, int data ){
        // Base case : if data is found at root or root  = null
        if (root == null) return false;
        if(root.data == data)
            return true;
        if(root.data < data)
            return search(root.right,data);

        return search(root.left, data);

       // return false;
    }
}
