package com.tiwari.daily_dsa.gfg;

public class ReverseString {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";

        StringBuffer reverse = new StringBuffer(str).reverse();
        new String(reverse);
    }
}
