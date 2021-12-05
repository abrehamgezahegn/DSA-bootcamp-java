package com.basics;

//import java.lang.reflect.Array;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        func(25, 55, 7, 6, 7, 8);
        mixed(10, 10, "20", "50", "50");
    }

    static void func(int... v) {
        System.out.println(v[0]);
        System.out.println(Arrays.toString(v));
        System.out.println(v);
    }

    static void mixed(int a, int b, String... v) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println(Arrays.toString(v));
    }
}
