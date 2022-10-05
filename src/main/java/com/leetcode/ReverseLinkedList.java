package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){
           this.val = val;
           this.next = next;
        }
    }
    static class LinkedList{
        ListNode head = new ListNode();
        int size = 0;
        LinkedList(int data){
            head.val = data;
            head.next = null;
            this.size++;
        }
        void insert(int val){
            ListNode node = new ListNode(val);
            if(head == null) {
                head = node;
                size++;
            }
            // TO BE CONTINUED
            else{
                ListNode curr = head;
                while (curr.next != null){
                    curr = curr.next;
                }
                curr.next = node;
                size++;

            }
            return;
        }
        void traverse(){
            ListNode curr = head;

            for (int i = 0; i < size; i++){
                System.out.print(curr.val);
                if(i != size - 1)
                    System.out.print(" -> ");
                curr = curr.next;
            }
            return;
        }
        void traverse(ListNode head){
            ListNode curr = head;

            for (int i = 0; i< size; i++){
                System.out.print(curr.val);
                if(i != size -1)
                    System.out.print(" -> ");
                curr = curr.next;
            }
            return;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        LinkedList li = new LinkedList(1);
        li.insert(2);
        li.insert(3);
        li.insert(4);
        li.insert(5);
        li.traverse();
        System.out.println();
        System.out.print(li.size);

        ListNode node = reverseRecursively(li.head);
        System.out.println();
        li.traverse(node);
    }
    static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        if(head == null || head.next == null){
            return head;
        }

        else{
            while (curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
        }
        return prev;
    }

    static ListNode reverseRecursively(ListNode head){

        if(head == null || head.next == null)
            return head;

        ListNode reverseListHead = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return reverseListHead;
    }

}
