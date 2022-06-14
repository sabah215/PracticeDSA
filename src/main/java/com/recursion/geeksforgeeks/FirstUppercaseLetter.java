package com.recursion.geeksforgeeks;

public class FirstUppercaseLetter {

    public static void main(String[] args) {
        String s = "saBah";

        System.out.println(getFirstUppercase(s, 0));
    }

    public static String getFirstUppercase(String str, int i){
        if(i < str.length()) {
            if (Character.isUpperCase(str.charAt(i))) {
                return String.valueOf(str.charAt(i));
            }


        }
        return   getFirstUppercase(str, i + 1);


    }
}
