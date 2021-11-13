package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("Enter five items: ");

        for (int i = 0; i < nums.length  ; i++) {
            nums[i]= in.nextInt();
        }

        System.out.println("Enhanced for loop");

        for(int num: nums){
            System.out.println(num);
        }

//        System.out.println("Array is " + Arrays.toString(nums));

    }
}
