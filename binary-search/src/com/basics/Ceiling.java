package com.basics;

public class Ceiling {
    public static void main(String[] args) {

//      System.out.println("Ceiling of num: " + ceilingOfNum(new int[]{-4,3,12,33,45,46,78}, 88 ));
        System.out.println("Ceiling of num: " + ceilingOfNum(new int[]{78, 46,35,24,12,11,10,-1}, 46 ));

    }

    static int ceilingOfNum(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int middle;
        boolean isAsc = nums[0] < nums[end];

        if(isAsc &&  target > nums[nums.length - 1]){
            return  -1;
        }else if(!isAsc && target > nums[0] ){
            return -1;
        }


        while (start <= end){
            middle = start + (end - start)  / 2;
            if(nums[middle] == target){
                return middle;
            }
            if(isAsc){
                if(nums[middle] > target ){
                    end  = middle - 1;
                }else {
                    start  = middle + 1;
                }

            }
            else {
                if(nums[middle] < target ){
                    end  = middle - 1;
                }else {
                    start  = middle + 1;
                }

            }
        }
        if(isAsc){
            return  start;
        }else {
            return end;
        }
    }


}
