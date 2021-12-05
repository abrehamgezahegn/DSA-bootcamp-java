package com.basics;

import org.w3c.dom.html.HTMLObjectElement;

import java.util.Arrays;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println("Stood: " + infiniteArraySearch(nums, 6));
    }



    static int infiniteArraySearch(int[] nums, int target){
        int chunkStart = 0;
        int chunkEnd = 1;

        while (target > nums[chunkEnd]){
            int temp = chunkEnd;
            chunkEnd = chunkEnd + (chunkEnd - chunkStart + 1)*2;
            chunkStart = temp + 1;
//            System.out.println();
        }

        return  searchInChunk(nums, chunkStart, chunkEnd, target);
    }

    static int searchInChunk(int[] chunk, int start, int end, int target){
        while (start <= end){
            int m = start + (end - start) / 2;
            if(chunk[m] == target){
                return m;
            }else if (target > chunk[m]){
                start = m + 1;
            }else {
                end = m - 1;
            }

        }


        return -1;

    }
}
