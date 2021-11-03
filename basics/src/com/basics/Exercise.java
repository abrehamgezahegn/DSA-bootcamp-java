package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
//        evenOrOdd();
//        greeting();
//        simpleInterest();
//        calculator();
//        largest();
//        fibonacci();
//        System.out.println(fib2(7));
//        isPalindrome("heeh");
//        System.out.println(isArmstrong(371));
        armstrongNum(1,
                500);
    }


    public static void evenOrOdd() {
        // odd or even
        Scanner input = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }

    public static void simpleInterest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double iRate = input.nextDouble();
        System.out.print("Enter years passed: ");
        int years = input.nextInt();

        double finalAmount = principal * (1 + iRate / 100 * years);
        System.out.println("You owe: " + finalAmount);
    }


    public static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operator: ");
        char operator = input.next().charAt(0);

        System.out.print("Enter num2: ");
        double num2 = input.nextDouble();

        switch (operator) {
            case '+': {
                System.out.println("Result is: " + (num1 + num2));
                break;
            }
            case '-': {
                System.out.println("Result is: " + (num1 - num2));
                break;
            }
            case '*': {
                System.out.println("Result is: " + (num1 * num2));
                break;
            }
            case '/': {
                System.out.println("Result is: " + (num1 / num2));
                break;
            }
            default: {
                System.out.println("Operator not found baba");
            }
        }
    }

    public static void largest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = input.nextInt();

        System.out.println("Enter num2:");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Largest is:  " + num1);
        } else if (num1 == num2) {
            System.out.println("Nums are equal");
        } else {
            System.out.println("Largest is: " + num2);
        }

    }

    public static void fibonacci() {
//        6
//        1, 1 , 2 , 3 , 5, 8, 13, 21
        int series[] = new int[10];

        for (int i = 0; i <= 7; i++) {
            if (i < 2) {
                series[i] = 1;

            } else {
                System.out.println("index is " + i);
                series[i] = series[i - 1] + series[i - 2];
            }
        }

        System.out.println(Arrays.toString(series));

    }

    public static int fib2(int num) {
        if (num < 2) {
            return num;
        } else {
            return fib2(num - 1) + fib2(num - 2);
        }
    }

    public static void isPalindrome(String sentence) {
        StringBuilder input1 = new StringBuilder();
        input1.append(sentence);
        input1.reverse();

        String reversed = String.valueOf(input1);

        boolean isPali = true;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != reversed.charAt(i)) {
                isPali = false;
            }
        }

        if (isPali) {
            System.out.println("Is palii");
        } else {
            System.out.println("Is not pali");
        }
    }

    public static void armstrongNum(int start, int finish) {

        for (int i = start; i <= finish; i++) {
            if (isArmstrong(i)) {
                System.out.println("We got armstrong" + i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int i = 0;
        double sum = 0;
        temp = num;
        while (i < digits) {
            int last = temp % 10;
            sum = sum + Math.pow(last, 3);
            i++;
            temp = temp / 10;
        }

        return sum == num;
    }
}
