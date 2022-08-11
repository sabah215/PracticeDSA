package com.recursion.basicstringquestions;

public class Ascii {
    public static void main(String[] args) {

//        char ch = 'a';
        //Get ascii value
//        System.out.println(ch + 0);
        // Cast back to character
//        System.out.println((char) (ch + 0));
//        System.out.println();
        subseqAscii("", "abc");

    }

    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }
}
