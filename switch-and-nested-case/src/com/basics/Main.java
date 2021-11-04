package com.basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word please: ");
        String item = in.nextLine();
        System.out.print("Enter color: ");
        String color = in.nextLine();

        switch (item) {
            case "ball":
                System.out.println("Should bounce");
                switch (color) {
                    case "black":
                        System.out.println("Alright that's black ball");
                        break;
                    case "white":
                        System.out.println("Ball, color is white");
                        break;
                    default:
                        System.out.println("Give me a valid color");
                }
                break;
            case "apple":
                System.out.println("Eat that apple");
                break;
            case "orange":
                System.out.println("It's a freaking orange");
                break;
            default: {
                System.out.println("That's nothing");
            }
        }


    }
}
