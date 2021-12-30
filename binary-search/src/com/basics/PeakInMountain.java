package com.basics;

public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println("Peak: " + peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int m = start + (end - start)/2;
            if(m < end && arr[m] > arr[m+1]){
                end = m;
            }else{
                start = m + 1;
            }
        }

        return end;

    }
}
