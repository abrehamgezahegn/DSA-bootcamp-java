package com.basics;

public class Floor {
    public static void main(String[] args) {
//        System.out.println("floor of num: " + floorOfNum(new int[]{-4,3,12,33,45,46,78}, -10 ));
        System.out.println("Floor of num: " + floorOfNum(new int[]{2,3,5,9,14,14,14,14,14,14, 16,18}, 15 ));

//        int a = 'z';
//        System.out.println("a "  + a);
    }


    static int floorOfNum(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int middle;
        boolean isAsc = nums[0] < nums[end];
        System.out.println("IS ACC " + isAsc );
        if(isAsc &&  target < nums[0]){
            return  -1;
        }else if(!isAsc && target < nums[end] ){
            return -1;
        }


        while (start <= end){
            middle = start + (end - start)  / 2;

            if(isAsc){
                System.out.println("is accceendingg");
                if( target <= nums[middle] ){
                    end  = middle - 1;
                }else if(target > nums[middle]) {
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
            if(nums[end + 1] == target){
                return end + 1;
            }
            return  end ;
        }else {
            return start;
        }
    }
}
