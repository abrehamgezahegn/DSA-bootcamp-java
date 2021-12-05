package com.condionansAndLoops;

public class MaxAdjacentSum {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 100};
        int[] a = {18, -12, 9, -10, 100};
//        int[] a = {1, 1, 1, 1, 1, 2, 1, 1, 1};
        System.out.println("Max adj: " + largestAdjacentSum(a));
    }

    static int largestAdjacentSum(int[] a) {
        int max = a[0] + a[1];
        for (int i = 2; i < a.length; i = i + 2) {
            int sum = 0;
            if (i == a.length - 1) {
                sum = a[i];
            } else {
                sum = a[i] + a[i + 1];
            }
//            sum = a[i] + a[i + 1];


            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
