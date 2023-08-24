package com.tiwari.daily_dsa.basic;

public class ConcatAndReverse {
    public static void main(String[] args) {
        String str1 = "Geeks";
        String str2 = "forGeeks";

        String str3 = str1.concat(str2);
        StringBuilder builder =new StringBuilder(str3);
        System.out.println(builder.reverse());
    }
}
