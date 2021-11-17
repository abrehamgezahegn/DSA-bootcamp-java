package com.basics;

public class BinarySearch {

    public static void main(String[] args) {
//        System.out.println("Search: " + binarySearch(new int[]{2,4,6,12,15,17,19} , 15));
        System.out.println("Search: " + binarySearch(new int[]{19,17,15,12,6,4,3} , 17));
    }

    static boolean binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int middle;

        while(start <= end){
            middle = start + (end - start)  / 2 ;

            if(nums[middle] == target){
                return true;
            }


            else if(nums[middle] < target){
                end = middle  - 1;
            }else {
                start = middle + 1;
            }
        }
        return false;
    }
}
