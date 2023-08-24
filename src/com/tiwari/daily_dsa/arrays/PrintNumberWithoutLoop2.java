package com.tiwari.daily_dsa.arrays;

public class PrintNumberWithoutLoop2 {
    public static void main(String[] args) {
        int n = 5;
        printLoop(n);

    }

    private static void printLoop(int n) {

        if (n>0) {
            printLoop(n-1);
            System.out.println(n);
        }
    }
}
