package com.basics;

public class OrderAgnositicBSearch {
    public static void main(String[] args) {
        System.out.println("Searching "  + orderAgnositicBSearch(new int[]{1,3,4,12,45,78,100} , 45 ));
        System.out.println("Searching "  + orderAgnositicBSearch(new int[]{299, 89, 74,62,43,12,3,2,-1} , 74 ));
    }

    static int orderAgnositicBSearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int middle;
        boolean isAscending = nums[end] - nums[0] > 0;

        while(start <= end){
            middle = start + (end - start)  / 2 ;

            if(nums[middle] == target){
                return middle;
            }

            if(isAscending){
                if(nums[middle] > target){
                    end = middle  - 1;
                }else {
                    start = middle + 1;
                }
            }else {
                if(nums[middle] < target){
                    end = middle  - 1;
                }else {
                    start = middle + 1;
                }
            }



        }
        return -1;
    }
}
