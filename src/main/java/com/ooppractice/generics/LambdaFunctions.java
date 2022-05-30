package com.ooppractice.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
//        arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

        // foreach() takes Consumer type as input
        arr.forEach(fun);
        Operation sum = (a,b) -> a + b;
        Operation diff =  (a,b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        myCalculator.operate(5,6, sum);
        myCalculator.operate(5,6, diff);
        myCalculator.operate(5,6, prod);
        myCalculator.operate(5,6, div);

    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
    interface Operation{
        int operation(int a, int b);
    }
}
