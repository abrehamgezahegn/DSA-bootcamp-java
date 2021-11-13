package com.basics;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4, 5};
        System.out.println( getMax(arr));

        System.out.println("max in range " + getMaxInRange(arr , 1 , 6));
        System.out.println("reveresed  " + Arrays.toString(reverse2(arr)));

    }

    static  int getMax(int array[]){
//        int max = array[0];
        int max = Integer.MIN_VALUE;
        for(int item: array){
            if(item > max){
                max = item;
            }
        }
        return max;
    }

    static  int getMaxInRange(int arr[] , int lowerBound, int upperBound){
        int max = arr[lowerBound];
        if(lowerBound < upperBound){
            return 0;
        }
        for (int i = lowerBound + 1; i <  upperBound; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static int[] reverse(int[] arr){
        int reversed[] = new int[arr.length];

        int count = arr.length - 1;
        for (int i = 0; i < arr.length ; i++) {
            reversed[count ] = arr[i];
            count--;
        }

        return  reversed;
    }

    static int[] reverse2(int[] array){
        int[] arr = array;
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start ,end);
            start++;
            end--;
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b ){
        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;
    }
}
