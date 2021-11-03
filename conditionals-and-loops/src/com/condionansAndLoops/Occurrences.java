package com.condionansAndLoops;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        System.out.print("Enter the digit you want to count: ");
        int digitToCount = in.nextInt();

        int count = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == digitToCount) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Count is " + count);
    }
}
