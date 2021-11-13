package com.basics;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[][] arr = {{1, 6, 89, 4, 12, 45}};
        System.out.println("original array : " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        swap(arr[0], 1, 2);
        System.out.println("arr after swap " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void swap(int[] arr, int a, int b ){
        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;
    }
}
