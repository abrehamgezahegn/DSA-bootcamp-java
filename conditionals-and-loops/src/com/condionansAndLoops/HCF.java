package com.condionansAndLoops;

public class HCF {
    public static void main(String[] args) {
        int a = 11;
        int b = 60;
        int larger = a;
        int smaller = b;


        if (a < b) {
            larger = b;
            smaller = a;
        }

        int rem = smaller;
        int hcf = 0;
        while (rem > 0) {
            rem = larger % smaller;
            System.out.println("rem is " + rem);
            if (rem == 0) {
                hcf = smaller;
                break;
            } else {
                larger = smaller;
                smaller = rem;
            }
        }

        System.out.println("HCF is: " + hcf);

    }
}
