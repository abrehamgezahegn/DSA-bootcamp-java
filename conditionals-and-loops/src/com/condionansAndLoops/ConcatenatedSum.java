package com.condionansAndLoops;

public class ConcatenatedSum {
    public static void main(String[] args) {
        System.out.println("Check " + checkConcatenatedSum(198, 2));
    }

    static int checkConcatenatedSum(int number, int catlen) {
        int sum = 0;
        int num = number;
        while (num > 0) {
            int lastDigit = num % 10;
            int i = 0;
            int p = 0;
            while (i < catlen) {
                p = (p * 10) + lastDigit;
                i++;
            }
            sum += p;
            num /= 10;
        }
        System.out.println("Sum " + sum);
        if (sum == number) {
            return 1;
        } else {
            return 0;
        }
    }
}
