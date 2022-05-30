package com.realInterview;

/**
 * This was my first google phone interview questions
 * Date: May 17, 2022 11:00 am EST
 * Question: Given an undirected graph with adjacent nodes.
 * You are required to return a list of at least one cyclic path from any starting node.
 * The method takes the graph with nodes as input. I should have understood the parameter structure by which
 * the graph representation is passed as an argument. Finally, I asked questions and figured out
 * that the Nodes are passed a Map<Character, List<Character>> graph
 * */

import javax.xml.stream.events.Characters;
import java.util.*;

public class CyclicPath {

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('A', new ArrayList<>(Arrays.asList('B', 'D')));
        graph.put('B', new ArrayList<>(Arrays.asList('C', 'A')));
        graph.put('C', new ArrayList<>(Arrays.asList('D', 'B')));
        graph.put('D', new ArrayList<>(Arrays.asList('A', 'C')));
        getPath(graph);

    }
    /**
     * @param graph is a map with each node as a key that points to the list of adjacent nodes
     * */
    public static List<Character> getPath(Map<Character, List<Character>> graph){
            List<Character>  path = new ArrayList<>();
            char startNode = 'A';
            for (Map.Entry<Character, List<Character>> entry:
                 graph.entrySet()) {
                System.out.println(entry.getKey()+" -> "+ entry.getValue());
                //@TODO: Get the adjacent node
                // @TODO: from the list of adjacent nodes of a given node
                if(path.contains(startNode)){
                    List<Character> values = graph.get(startNode);
                    System.out.println(values);

                }
            }
            return path;
    }

}


