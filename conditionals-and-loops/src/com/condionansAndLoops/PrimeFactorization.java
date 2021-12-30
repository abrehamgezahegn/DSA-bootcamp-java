package com.condionansAndLoops;

import java.util.ArrayList;

public class PrimeFactorization {
    public static void main(String[] args) {
        primeFact(24);
    }

    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeFact(int n) {

        while (!isPrime(n)) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n /= i;
                    break;
                }
            }
        }
        System.out.println(n);

//
//
//        if (n > 0) {
//            while (n % 2 == 0) {
//                System.out.print(2 + " ");
//                n /= 2;
//            }
//
//            for (int i = 3; i <= Math.sqrt(n); i += 1) {
//                while (n % i == 0) {
//                    System.out.print(i + " ");
//                    n /= i;
//                }
//            }
//            if (n > 2)
//                System.out.print(n);
//        }


    }
}
