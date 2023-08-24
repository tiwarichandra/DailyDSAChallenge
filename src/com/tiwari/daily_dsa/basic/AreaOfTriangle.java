package com.tiwari.daily_dsa.basic;

public class AreaOfTriangle {
    public static void main(String[] args) {
        int a,b,c,s;
        a= 3;
        b=4;
        c =5;
        s = (a+b+c)/2;
        double area = Math.sqrt(s * (s-a)* (s-b)* (s-c));
        System.out.println(area);
    }
}
