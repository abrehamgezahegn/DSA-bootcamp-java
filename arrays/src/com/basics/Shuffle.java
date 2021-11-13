package com.basics;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {4,5,1,6, 5, 90};
        System.out.println("Original " + Arrays.toString(arr));
        System.out.println("shuffled" + Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int m = n -1 ;
        int k = 0;
        for(int i=0; i < nums.length; i++){
            if(i%2!=0){
                newArray[i] = nums[i + m ];
                m--;
            }else{
                newArray[i] = nums[i - k];
                k++;
            }
        }

        return newArray;
    }}
