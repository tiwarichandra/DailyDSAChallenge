package com.tiwari.daily_dsa.gfg;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "welcome to geeksforgeeks";

       String str1 = str.replaceAll("[aeiou]", "");
        System.out.println(str1);
    }
}
