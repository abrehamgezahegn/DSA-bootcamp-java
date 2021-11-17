package com.basics;

import java.util.ArrayList;

public class EvenDigits {
    public static void main(String[] args) {
        System.out.println("Even digits " + evenDigits(new int[]{122,34,-555,6778}));
        System.out.println("Even digits " + evenDigits(new int[]{-1220,340,555,6778}));
    }

    static int evenDigits(int[] nums){
       int count = 0;
        for(int num: nums){
            if(digits2(num) % 2 == 0){
                count++;
            }
        }
        return  count;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        int digits = 0;
        while(num > 0){
            num/= 10;
            digits++;
        }
        return  digits;
    }

    static int digits2(int num){
        if(num < 0){
            num*=-1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
