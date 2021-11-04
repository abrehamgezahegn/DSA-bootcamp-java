package com.basics;

import jdk.dynalink.beans.MissingMemberHandlerFactory;

public class Exercise {
    public static void main(String[] args) {
//        isPrime(83);
        System.out.println(isArmstrong(153));
    }


    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.pow(num, 0.5); i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return false;
            }
        }
        System.out.println("Is Prime");
        return true;
    }

    static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            System.out.println("temp: " + temp);
            int lastDigit = temp % 10;
            System.out.println("last digit: " + lastDigit);
            sum += Math.pow(lastDigit, 3);
            temp /= 10;

        }
        return sum == num;
    }
}
