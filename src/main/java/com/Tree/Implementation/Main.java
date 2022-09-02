package com.Tree.Implementation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(8);
        tree.insert(11);
        tree.insert(4);
        tree.insert(13);
        tree.insert(20);
        tree.insert(1);

        tree.inOrder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
       // tree.levelOrderTraversal(tree.root);



//        boolean isFound = tree.search(tree.root, 7);
//        System.out.println(isFound);

//        int minI = tree.getMinIteratively(tree.root);
//        int maxI = tree.getMaxIteratively(tree.root);
//        int max = tree.getMax(tree.root);
//        int min = tree.getMin(tree.root);
//        System.out.println();
//        System.out.println(minI + " "+ maxI + " " + max+" "+ min);

//        if(min == minI && maxI == max)
//            System.out.println("Test passed :)");

//        else System.out.println("Maximum found. Test  falied :(");
//        System.out.println();
//        System.out.println(tree.getHeight(tree.root));
//        System.out.println(tree.getMax(tree.root));
//        System.out.println(tree.getNumberOfNodes(tree.root));

    }
}
