package com.tiwari.daily_dsa.arrays;

public class PrintNWithoutLoop {

    static int i = 1;

//    static void printNOs(int n) {
//        if (n>0) {
//            printNOs(n-1);
//            System.out.print(n);
//
//        }
//    }

    static void printNOs(int n) {
        if (n<=10) {
            System.out.println(n);
            printNOs(n+1);


        }
    }

    public static void main(String[] args) {
        int n =1;

        printNOs(n);
    }
}
