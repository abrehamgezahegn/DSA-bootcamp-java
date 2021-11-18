package com.basics;

import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {

//        int[] arr = {2,3,4,6,7};
        int[] arr = {2,2,5};
        System.out.println("Search: " + Arrays.toString( searchRange(arr, 5)));


    }

    static int[] searchRange(int[] nums, int target) {
        int upperBound = searchCeilOrFloor(nums,target, false);
        int lowerBound = searchCeilOrFloor(nums,target, true);
        return  new int[]{lowerBound, upperBound};
    }

    static  int searchCeilOrFloor(int[] nums, int target, boolean isFloor){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        if(nums.length == 0){
            return -1;
        }

        while (start <= end){
            int   m = start + (end - start) / 2;

            if(target < nums[m]){
                end = m - 1;
            }else if(target > nums[m]){
                start = m + 1;
            }else {
                ans = m;
                if(isFloor){
                    end  = m -1;
                }else {
                    start = m + 1;
                }
            }
        }

        return ans ;
    }

    }
