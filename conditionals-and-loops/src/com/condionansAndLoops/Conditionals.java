package com.condionansAndLoops;

public class Conditionals {

    public static void main(String[] args) {
        int salary = 250;
        if (salary > 1000){
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }

        System.out.println("Salary is " + salary);
    }
}
