package com.geeksforgeeks;

public class CheckAllCharactersAreSame {

    public static void main(String[] args) {
        String S = "gs";
        System.out.println(check(S));
    }

    public static boolean check(String S){
        if(S.length() > 1){
            for(int i = 0; i < S.length()-1;){
                if(S.charAt(i) == S.charAt(i+1)){
                    i++;
                }
                else return false;
            }
        }
        return true;
    }
}
