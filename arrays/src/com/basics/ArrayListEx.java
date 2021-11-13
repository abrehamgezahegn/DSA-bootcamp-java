package com.basics;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(40);
        // initial capacity is used as an input
        // to make the list dynamic size

        arr.add(10);
        arr.add(15);
        arr.add(60);
        arr.add(80);
        arr.add(90);

        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        System.out.println( arr.get(2) );

        System.out.println( arr.contains(49) );

        System.out.println("size: " + arr.size());
        arr.set(1, 57);
        System.out.println(arr);

        System.out.println(arr.toArray());

        arr.removeIf(item -> {
            System.out.println("Checking  item: " + item );
            return item % 2 != 0;
        });
        System.out.println(arr);

        arr.clear();
        System.out.println(arr);



    }
}
