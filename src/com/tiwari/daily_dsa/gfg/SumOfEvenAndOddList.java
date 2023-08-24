package com.tiwari.daily_dsa.gfg;

public class SumOfEvenAndOddList {
    public static void main(String[] args) {
        int N = 1;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i<=N; i++) {
                if (i%2==0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);


    }
}
