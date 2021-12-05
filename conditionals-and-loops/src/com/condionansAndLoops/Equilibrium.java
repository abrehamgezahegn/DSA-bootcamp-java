package com.condionansAndLoops;

public class Equilibrium {

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 1, 2, 1, 7};
        System.out.println("Equi " + equilibriumItem(nums));
    }

    static int equilibriumItem(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int leftSum = 0;
        int rightSum = 0;

        while (start < end) {
            if (leftSum < rightSum) {
                leftSum += nums[start];
                start += 1;
            } else {
                rightSum += nums[end];
                end -= 1;
            }
        }

        if (leftSum == rightSum) {
            return start;
        }
        return -1;
    }
}
