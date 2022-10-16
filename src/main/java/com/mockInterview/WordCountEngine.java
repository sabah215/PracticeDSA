package com.mockInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCountEngine {

    public static void main(String[] args) {
        String document = "Practice makes perfect. you'll only get Perfect by practice. just practice!";

//        wordCountEngine(document);
        char [] ch = {'a','b'};
        System.out.println(String.valueOf(ch));


    }

    static void wordCountEngine(String document) {
        Map<String, Integer> cleanWord = new HashMap<>();

        String [] wordList = document.split(" ");
//        System.out.println(Arrays.asList(wordList));
        for (String s : wordList){
            // convert each token into lower case
            String lower = s.toLowerCase();
            //remove punctuation
            char [] ch = {};
            for(int i = 0; i < lower.length();i++){
                //declare array of size s
                ch = new char [lower.length()];
                // push each character into the array if it is an alphabet.
                if(lower.charAt(i) >= 'a' && lower.charAt(i) <='z'){
                    ch[i] = lower.charAt(i);
                }
            }

            // Now add the cleanword to the map
            if(cleanWord.containsKey(String.valueOf(ch))){
                int count = cleanWord.get(String.valueOf(ch));
                cleanWord.put(String.valueOf(ch), count++);
            }
            else{
                cleanWord.put(String.valueOf(ch), 1);
            }

        }
        // then retreive each entry from map
        String [][] wordCountList = new String[cleanWord.size()][2];
        for(Map.Entry<String, Integer> e : cleanWord.entrySet()){
            String [] arr = new String [2];
            arr[0] = e.getKey();
            arr[1] = e.getValue().toString();
        }

        // add key value to a list and
        // add it to list of list

    }
}
