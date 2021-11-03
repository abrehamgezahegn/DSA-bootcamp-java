package com.basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        System.out.println("Number you enterd is : " + num);
        int money = 1_000_000;
    }
}
