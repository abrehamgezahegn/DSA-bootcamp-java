package com.basics;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {{1,0,0} , {1,1,1} , {0, 0,1}};
        System.out.println("Original "  );
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }

        System.out.println("Flipped and inverted");
        flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }

//    static int[][] flipAndInvertImage(int[][] image) {
//        for(int i = 0;i<image.length;i++){
//            for(int j = 0;j<(image[i].length+1)/2;j++){
//                swap(image,i,j,i,image.length-1-j);
//            }
//        }
//        return image;
//    }
    static void swap(int [][]arr,int firstIndex,int secondIndex,int one,int two){
        System.out.println(arr[firstIndex][secondIndex]);
        System.out.println("^ thing " + (arr[firstIndex][secondIndex]^1));
        int temp = arr[firstIndex][secondIndex]^1;
        arr[firstIndex][secondIndex] = arr[one][two]^1;
        arr[one][two] = temp;
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int[] temp = new int[image[i].length];
            int m = 0;
            for(int j = image[i].length - 1; j >= 0; j--){
                System.out.println("Taking: " + image[i][j] );
                temp[m] = image[i][j]^1;
                m++;
            }
            image[i] = temp;
        }
        return image;
    }
}
