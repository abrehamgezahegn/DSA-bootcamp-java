package com.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] a = {1,4,63, 9, 100};
        System.out.println("Concated " + Arrays.toString(concatenate(a)));
    }


    static int[] concatenate(int arr[]){
        int newArray[] = new int[arr.length*2];
        for(int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
            newArray[i + arr.length] = arr[i];
        }
        return  newArray;
    }
}
