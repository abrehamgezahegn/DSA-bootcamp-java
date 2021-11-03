package com.condionansAndLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = in.nextLine();
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed = reversed + sentence.charAt(i);
        }
        System.out.println("reverd " + reversed);

    }
}
