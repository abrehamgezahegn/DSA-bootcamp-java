package com.basics;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
       int[][] arr = spiralMatrixIII(1,4, 0 ,0);
       for(int[] item: arr){
//           System.out.print(Arrays.toString( item ) );
       }
    }

    static int[][] spiralMatrixIII(int R, int C, int x, int y) {
        int[][] res = new int[R * C][2];
        int dx = 0, dy = 1, n = 0, tmp;
        for (int j = 0; j < R * C; ++n) {
            for (int i = 0; i < n / 2 + 1; ++i) {
                System.out.println("j " + j);
//                System.out.println("x:" + x + " " + "y: "  + y);
                if (0 <= x && x < R && 0 <= y && y < C)
                    res[j++] = new int[] {x, y};
                x += dx;
                y += dy;
            }
            tmp = dx;
            dx = dy;
            dy = -tmp;
        }
        return res;
    }
}
