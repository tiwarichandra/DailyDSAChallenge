package com.tiwari.daily_dsa.basic;

public class SumOfInteger {
    public static void main(String[] args) {
        int N = 8850;
        int sum = 0, digit;

        while (N > 0) {

            digit = N % 10;
            sum = sum + digit;
            N = N / 10;
        }
        System.out.println("Sum of digits : " + sum);
    }

}