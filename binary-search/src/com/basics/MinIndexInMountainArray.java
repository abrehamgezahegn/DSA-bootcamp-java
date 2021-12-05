package com.basics;


// https://leetcode.com/problems/find-in-mountain-array/
public class MinIndexInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr =  {1,5,2};
        int target = 2;

        int peak = findPeakElement(mountainArr);
        int leftHalfResult = orderAgnositicBSearch(mountainArr,target,0,peak);
        if(leftHalfResult > -1){
            System.out.println("left side " + leftHalfResult   );
        }
        System.out.println("fining in right");
        System.out.println("right side: " +  orderAgnositicBSearch(mountainArr,target,peak,mountainArr.length - 1));
    }


    static int findPeakElement(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        while(start < end){
            int m = start + (end - start)/2;

            if (mountainArr[m] < mountainArr[m+1]){
                start = m + 1;
            }else{
                end  = m;
            }
        }

        return end;

    }



    static int orderAgnositicBSearch(int[] mountainArr, int target, int start, int end){
        System.out.println("finiding between " + start + " " + end);
        int middle;
        boolean isAscending = mountainArr[end-1] - mountainArr[start] > 0;

        while(start <= end){
            middle = start + (end - start)  / 2 ;
            System.out.println("middled  "  + middle  );
            System.out.println("start " + start);
            System.out.println("end " + end);

            if(mountainArr[middle] == target){
                return middle;
            }

            if(isAscending){
                if(mountainArr[middle] > target){
                    end = middle  - 1;
                }else {
                    start = middle + 1;
                }
            }else {
                System.out.println("is desccding");
                if(mountainArr[middle] < target){
                    end = middle  - 1;
                }else {
                    start = middle + 1;
                }
            }



        }
        return -1;
    }

}
