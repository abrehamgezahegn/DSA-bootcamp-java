package com.condionansAndLoops;

public class Hollow {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0};
        System.out.println(isHollow(arr));
    }

    static int isHollow(int[] a) {
        int left = 0;
        int right = 0;
        int zeros = 0;
        int leftEnd = 0;
        int rightStart = 0;


        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                left++;
            } else {
                leftEnd = i;
                break;
            }
        }

        for (int i = leftEnd; i < a.length; i++) {
            if (a[i] == 0) {
                zeros++;
            } else {
                rightStart = i;
                break;
            }
        }

        for (int i = rightStart; i < a.length; i++) {
            if (a[i] != 0) {
                right++;
            }
        }

        if ((left > 0 || right > 0) && (a[0] == 0 || a[a.length - 1] == 0)) {
            return 0;
        }


        if (zeros < 3) {
            return 0;
        }
        if (left != right) {
            return 0;
        }


        return 1;

    }
}
