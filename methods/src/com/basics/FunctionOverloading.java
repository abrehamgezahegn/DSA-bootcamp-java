package com.basics;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        sum(1, 30);
        sum(10, 40, 30);
        print(1, 4, 5, 5);
        print("12", "12", "56", "67", "90");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void print(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void print(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
