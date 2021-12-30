package com.condionansAndLoops;

public class ZeroBalanced {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println("balanced: " + zeroBalanced(arr, arr.length));
    }

    static int zeroBalanced(int[] arr, int len) {
        if (len == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
            boolean found = false;
            for (int j = 0; j < len; j++) {
                if (arr[j] == -1 * arr[i]) {
                    found = true;
                }
            }

            if (!found) {
                return 0;
            }
        }

        if (sum == 0) {
            return 1;
        }

        return 0;
    }
}
