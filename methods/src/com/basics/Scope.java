package com.basics;

public class Scope {
    public static void main(String[] args) {
        int a = 10;

        {
            int b = 10;

//            int a = 10; can't do this
        }
    }

}
