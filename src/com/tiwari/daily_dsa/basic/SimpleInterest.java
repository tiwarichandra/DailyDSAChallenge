package com.tiwari.daily_dsa.basic;

public class SimpleInterest {
    public static void main(String[] args) {
        double a, p,r,n,ci;
        p = 1000;
        r = 10;
        n = 3;

       a = p * Math.pow((1 + (r / 100.0)), n);
       ci = a-p;
        System.out.println(a);
        System.out.println(ci);
    }
}
