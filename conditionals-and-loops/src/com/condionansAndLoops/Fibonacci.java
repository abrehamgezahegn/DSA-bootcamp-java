package com.condionansAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;

        while (num > 1){
            int temp = b;
            b = a + b;
            a = temp;
            num--;
        }
        System.out.println("FIB is " + b);
    }
}

//1 1 2 3 5 8