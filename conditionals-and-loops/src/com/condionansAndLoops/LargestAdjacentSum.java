package com.condionansAndLoops;

public class LargestAdjacentSum {
    public static void main(String[] args) {
        int[] arr = {100, 1, 2, 20, 3, 4, 10};
        System.out.println(largestAdjSum(arr, arr.length));
    }

    static int largestAdjSum(int[] arr, int len) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
