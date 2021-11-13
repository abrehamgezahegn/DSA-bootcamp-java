package com.basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int nums[][] = new int[10][];
        Scanner in = new Scanner(System.in);
        // column size is not mandatory
        // and can be dynamic size

        // possible to have different size arrays
//        int nums[][]  = {{1,4,5} , {1,78}};

        int[][] nums2 = new int[2][3];

        System.out.println("Enter array");
        for (int row = 0; row < nums2.length ; row++) {
            for (int column = 0; column < nums2[row].length; column++) {
                nums2[row][column] = in.nextInt();
            }
        }

        for (int row = 0; row < nums2.length ; row++) {
            for (int column = 0; column < nums2[row].length; column++) {
                System.out.print( nums2[row][column] + " ");
            }
            System.out.println();
        }


        for (int row = 0; row < nums2.length ; row++) {
            System.out.println(Arrays.toString(nums2[row]));
        }

        for(int[] arr: nums2){
            System.out.println(Arrays.toString(arr));
        }




    }
}
