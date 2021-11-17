package com.basics;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,5,6,2,5};
        System.out.println(  linearSearch(new int[]{1,45,5}, 2));
        System.out.println("Find 6 " + linearSearch2(nums , 100));
    }

    static int linearSearch(int[] arr, int target ){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return  -1;
    }

    static int linearSearch2(int[] arr, int target){
        for(int item: arr){
            if(item == target){
                return item;
            }
        }
        return Integer.MAX_VALUE;
    }

}
