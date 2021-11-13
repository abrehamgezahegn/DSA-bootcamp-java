package com.basics;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // datatype[] varname = new datatype[size]

        int[] nums = new int[10];
        String[] arr = new String[10];
        boolean[] arr2 = new boolean[10];
        // int[] nums - declaration
        // new int[10] - initialization,
        //                  creates object on heap memory, at run time,
        //                  dynamic memory allocation
        int[] nums2 = {1,2,4,5,6};
        System.out.println(nums[0]);
        System.out.println("String arr " + arr[0] );
        System.out.println("Boolean arr " + arr2[1]);
//        int[] nums3 = {"can't mix" , 1,4,5}
//
    }
}
