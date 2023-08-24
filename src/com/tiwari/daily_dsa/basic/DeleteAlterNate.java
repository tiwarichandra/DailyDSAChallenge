package com.tiwari.daily_dsa.basic;

public class DeleteAlterNate {
    public static void main(String[] args) {
        String str = "Geeks";
        char ch;
        String str1 = "";
        for (int i = 0; i<str.length();i++) {
            if (i%2==1) {
                ch = str.charAt(i);
                str1 = String.valueOf(ch);
            }
        }
        System.out.println(str1);
    }
}
