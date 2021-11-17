package com.basics;

import java.util.Arrays;

public class ProductOfArray2 {
    public static void main(String[] args) {
        int[] a =  productExceptSelf(new int[]{2,3,4,5});
        System.out.println(Arrays.toString(a));
    }


    static int[] productExceptSelf(int[] nums){

        int[] leftSide = new int[nums.length];
        leftSide[0] = 1;
        for(int i =1; i < nums.length; i++){
            leftSide[i]= leftSide[i - 1] * nums[i - 1];
        }
        System.out.println("Left side" + Arrays.toString(leftSide));
        int[] rightSide = new int[nums.length];
        // [ 60,20,5,1]
        rightSide[nums.length - 1] = 1;
        for(int i = nums.length - 1; i > 0; i--){
            // [ 60 ,  20 , 5 , 1]
            rightSide[i - 1] = rightSide[i ] * nums[i ];
        }
        System.out.println("Right side" + Arrays.toString(rightSide));

        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++){
            ans[i] = leftSide[i] * rightSide[i];
        }


        return  ans;
    }
}
