package com.condionansAndLoops;

public class ConsecutiveFactored {
    public static void main(String[] args) {
        System.out.println(isConsecutiveFac(24));
    }

    static int isConsecutiveFac(int n) {
        int prev = Integer.MIN_VALUE;

        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
            prev = 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                if (i - prev == 1) {
                    prev = i;
                    return 1;
                }
                n /= i;

            }

        }

        if (n - prev == 1) {
            return 1;
        }

        return 0;
    }
}
