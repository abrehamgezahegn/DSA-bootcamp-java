package com.basics;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] nums = {2,2,9,2,2,2,2,2,2,2};

        // {7,0,1,2,3,4}
//        System.out.println("Peak: " + findPeak(nums));
        System.out.println("search: " + search(nums, 9));
    }

    static int search(int[] nums, int target) {
//        int peak = findPeakWithDuplicate(nums);
        int peak = findPeak(nums);
        System.out.println("peak " + peak);
        if(peak == -1){ // array is not rotated
            return orderAgnositicBSearch(nums, target, 0, nums.length - 1);
        }


        if(nums[peak] ==  target ){
            return peak;
        }

        // search in first half of the array (which is guaranteed to be asc array )
//        int firstHalfResult =  orderAgnositicBSearch(nums, target, 0, peak);
//        if(firstHalfResult > -1){
//            return firstHalfResult;
//        }

        if(target >= nums[0]){ // search the first half
         return orderAgnositicBSearch(nums, target, 0, peak-1);
        }

        //else search in second half of the array (which is also guaranteed to be asc array )
        return orderAgnositicBSearch(nums, target, peak + 1 , nums.length - 1);

    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            // this will fail if array contains duplicate values
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int findPeakWithDuplicate(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int m = start + (end - start)/2;
           if(m < end && arr[m] > arr[m+1]){
               return m;
           }
           if(m > start &&  arr[m] < arr[m-1] ){
               return m - 1;
           }
           if(arr[m] == arr[end] && arr[m] == arr[start]){
               if(m > start && arr[start] > arr[start + 1]){
                   return start;
               }
               start++;
            if(end > start && arr[end] < arr[end - 1]){
                return  end-1;
            }
               end--;
           }

           else if(arr[start] < arr[m] || (arr[start] == arr[m] && arr[m] > arr[end])) {
               start = m + 1;
           } else {
               end = m - 1;
           }


        }

        return -1;

    }

    static int orderAgnositicBSearch(int[] nums, int target, int start, int end){
        int middle;
        boolean isAscending = nums[end] - nums[start] > 0;

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
