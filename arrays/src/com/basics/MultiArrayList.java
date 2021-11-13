package com.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr =  new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 4; i++) {
            arr.add(new ArrayList<Integer>(1));
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print("Enter " + (i+1) +"th "  +  "row: ");
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(in.nextInt());
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }
}
