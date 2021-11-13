package com.basics;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{10,15, 3} , {2,56,12}};
        System.out.println("Max " + maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int i=0; i< accounts.length; i++){
            int sum = 0;
            for(int j=0; j < accounts[i].length; j++){
                System.out.println("adding " + accounts[i][j]);
                sum+= accounts[i][j];
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
