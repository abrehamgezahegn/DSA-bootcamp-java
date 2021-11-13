package com.basics;

import java.util.Arrays;

public class Mutability {
    public static void main(String[] args) {
        int[] nums = {29, 5,78,8,1};
        System.out.println("Original "  + Arrays.toString(nums));

        change(nums);
        System.out.println("After change " + Arrays.toString(nums));

        changeOne(nums[3]);
        System.out.println("After change one " + Arrays.toString(nums));
    }

    static  void change(int[] arr){
        arr[1] = 100;
    }

    static  void changeOne(int num){
        num = 88;
    }
}
