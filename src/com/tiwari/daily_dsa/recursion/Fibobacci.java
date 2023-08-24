package com.tiwari.daily_dsa.recursion;

public class Fibobacci {

    static int fibonacci(int i) {

        if (i<2) {
            return i;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
