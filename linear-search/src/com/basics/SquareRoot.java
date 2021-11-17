package com.basics;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(   sqrt(1));
    }

    static int mySqrt(int x) {
        if(x == 0){
            return 0;
        }

        for(int i=0; i<x+1; i++){
            System.out.println("Checking: " + i);
            if(i*i > x){
                return --i;
            }
        }
        return -1;
    }

    static  int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}
