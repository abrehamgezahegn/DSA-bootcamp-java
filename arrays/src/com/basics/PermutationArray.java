package com.basics;

import java.util.Arrays;

public class PermutationArray {
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        System.out.println("permutation "  + Arrays.toString(permutation(arr)));
    }

    static int[] permutation(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newArray[i] =  arr[arr[i]];
        }
        return  newArray;
    }
}
