package com.Tree.Implementation;

import java.util.Scanner;

public class TreeImplementation {

    public TreeImplementation(){

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    // insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean isLeft = scanner.nextBoolean();
        if(isLeft){
            System.out.println("Enter the value");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of "+ node.value);
        boolean isRight = scanner.nextBoolean();
        if(isRight){
            System.out.println("Enter the value");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
}
