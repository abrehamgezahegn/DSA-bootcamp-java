package com.condionansAndLoops;

import java.util.Arrays;

public class Mileage {
    public static void main(String[] args) {
        int[] a = {9, 9, 9};
        System.out.println(Arrays.toString(mileage(a, 100, a.length)));
    }

    static int[] mileage(int[] a, int miles, int len) {
        int[] b = a;
        while (miles > 0) {
            addOne(b);
            miles--;
        }
        return b;
    }

    static void addOne(int[] mileage) {
        for (int i = 0; i < mileage.length; i++) {
            if (mileage[i] < 9) {
                mileage[i] += 1;
                break;
            } else {
                mileage[i] = 0;
            }
        }
    }
}
