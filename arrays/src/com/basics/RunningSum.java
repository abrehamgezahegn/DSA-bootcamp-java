package com.basics;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2, 1, 3,4};
        System.out.println("Reuslt " + Arrays.toString(runningSum(arr)));
        System.out.println("Optimized resumt" +  Arrays.toString(optimizedRunningSum(arr)));
    }

    static int[] runningSum(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum+= arr[j];
            }
            newArray[i] = sum;

        }
        return  newArray;
    }

    static  int[] optimizedRunningSum(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            arr[i]+= arr[i - 1];
        }
        return arr;
    }
}
