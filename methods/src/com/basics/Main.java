package com.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        saySome();
        int sum = sum();
        int sum2 = sum2(10, 20);
        System.out.println("sum is" + sum);
        System.out.println("sum2 is " + sum2);

        int a = 30;
        int b = 50;
        swap(a, b);
        System.out.println("a and b after calling swap a:" + a + " b: " + b);

        int[] arr = {1, 5, 51, 6, 15, 90};
        System.out.println("Original " + Arrays.toString(arr));
        changeArray(arr);
        System.out.println("Changed " + Arrays.toString(arr));

    }

    static void changeArray(int[] array) {
        array[2] = 800;
    }

    static void saySome() {
        System.out.println("Some");
    }

    static int sum2(int a, int b) {
        return a + b;
    }

    static int sum() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = b;
    }
}
