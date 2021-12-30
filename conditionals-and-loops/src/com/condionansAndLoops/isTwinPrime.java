package com.condionansAndLoops;

public class isTwinPrime {
    public static void main(String[] args) {
        System.out.println(isTwinPrime(6));
    }

    static int isTwinPrime(int n) {
        System.out.println("is prime check for  " + (n + 2) + " " + isPrime(n + 2));
        if (isPrime(n + 2) == 1) {
            return 1;
        }

        System.out.println("is prime check for  " + (n - 2) + " " + isPrime(n + 2));

        return isPrime(n - 2);
    }

    static int isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
