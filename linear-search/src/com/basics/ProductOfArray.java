package com.basics;

import java.util.Vector;

public class ProductOfArray {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<Integer>();
        a.add(0);
        a.add(4);
        a.add(3);
        a.add(2);
        System.out.println(productExceptSelf(a));
    }

    static Vector<Integer> productExceptSelf(Vector<Integer> nums) {
        Vector<Integer> ans = new Vector<Integer>();
        for (int i=0; i < nums.size(); i++){
            ans.add(multiplyWithout(nums, i));
        }
        return  ans;
    }

    static int multiplyWithout(Vector<Integer> nums, int index){
        int result = 1;
        for(int i=0; i<nums.size(); i++){
            if(i != index){
                result*=nums.get(i);
            }
        }
        return result;
    }
}
