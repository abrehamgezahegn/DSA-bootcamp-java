package com.condionansAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letter = in.next().trim().charAt(0);

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("It's a lowercase");
        }else {
            System.out.println("Upper case");
        }
    }
}
