package com.basics;

import java.util.Arrays;

public class RowColMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {{5,10,20,25}, {6,11,21,28}, {7,14,25, 33} , {8,17,28,36}};
        System.out.println("search: " + Arrays.toString(matrixSearch(matrix, 17)));
    }

    static int[]  matrixSearch(int[][] matrix, int target){
            int i=0;
            int j=matrix[i].length - 1;
            while (j >= 0 && i < matrix.length ){
                if(matrix[i][j] == target){
                    return new int[]{i,j};
                }
                if(target > matrix[i][j]){
                    i++;
                }else {
                    j--;
                }
            }

        return  new int[]{-1,-1};
    }
}
