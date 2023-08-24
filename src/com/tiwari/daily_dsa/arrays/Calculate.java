package com.tiwari.daily_dsa.arrays;

import java.util.Vector;

public class Calculate {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        Vector<Integer> integers = cppOperators(a, b);
        System.out.println(integers);
    }

    private static Vector<Integer> cppOperators(int A, int B) {

        Vector<Integer> integers = new Vector<>();
        integers.add(A+B);
        integers.add(A*B);
        integers.add(B-A);
        integers.add(B/A);

        return integers;

    }

}
