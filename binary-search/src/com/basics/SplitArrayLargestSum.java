package com.basics;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        System.out.println(largestSum(nums, 2));

    }
    static int largestSum(int[] nums, int m){

        // extreme case 1 (lower bound)
        // if m = nums.length - 1. i.e there are nums.length - 1 sub arrays with size 1
        // to minimize the largest sum among these m sub arrays
        // the ans in this case will be the max num of the array
        //
        // better explained in example
        // e.g nums = [7,2,5,10,8] && m = 5
        // sub arrays are [7],[2],[5],[10],[8]
        // ans is 10 -> max item
        int start = Integer.MIN_VALUE;

        // extreme case 2 (upper bound)
        // if m = 1 i.e there is 1 sub array with size nums.length
        // to minimize the largest sum among these m sub arrays
        // the ans in this case will be the sum of the all the items in the subarray
        //
        // better explained in example
        // e.g nums = [7,2,5,10,8] && m = 1
        // the only sub array is [7,2,5,10,8]
        // ans is 7+2+5+10+8 = 32
        int end =0;

        // after we find [start, end] we have range of numbers to find our possible answer
        // range -> apply binary search

        // this loops finds total sum and the max element
        for (int n : nums){
            end+=n;
            if(n > start){
                start = n;
            }
        }

        while(start < end){
            // our task is to push mid towards the ans
           int  mid = start + (end - start) / 2;
            int pieces = 1;
            System.out.println("start " + start);
            System.out.println("end " + end);
            System.out.println("mid " + mid);
            // count pieces (sub arrays) that can be made
            int sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if(sum + nums[i] <= mid){
                    sum+=nums[i];
                }else {
                    pieces++;
                    sum=nums[i];
                }
            }
            System.out.println("pieces " + pieces);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            // case  1: pieces are less than or equal to specified
            // means that mid is larger than it has to be
            // more items in a sub array -> fewer sub arrays -> fewer pieces
            // therefore, we reduce mid
            if(pieces <= m){
                end = mid;
            }else if(pieces > m){
                // case  2: pieces are more than specified
                // means that mid is less than it has to be
                // i.e individual sub array size is small
                // less items in a sub array -> more sub arrays -> more pieces
                // therefore we increase mid
                start = mid + 1;
            }


        }

        return start ;
    }
}
