package com.tiwari.daily_dsa.gfg;


import java.util.Scanner;

abstract class A {
    int prod;
    abstract void m1(int p, int q);
    void m2() {
        System.out.println(prod);
    }
}



public class AbstractKeywordCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            B b = new B();
            b.m1(a1, a2);
            b.m2();
        }
    }
}
class B extends A
{
    void m1(int p,int q) {
        prod = p*q;
    }
}
