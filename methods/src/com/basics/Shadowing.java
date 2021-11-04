package com.basics;

public class Shadowing {
    static int a = 10;

    public static void main(String[] args) {
        System.out.println("a: " + a);
        int a = 20; // this shadows the a variable above
        System.out.println("after new a, a: " + a);
    }


}
