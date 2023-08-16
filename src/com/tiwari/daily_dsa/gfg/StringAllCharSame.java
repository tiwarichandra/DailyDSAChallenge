package com.tiwari.daily_dsa.gfg;

public class StringAllCharSame {
    public static void main(String[] args) {
        String str = "geeks";
        char c = str.charAt(0);
        for (int i =0; i<str.length(); i++) {
            if (str.charAt(i) ==c) {
            continue;

            }
            System.out.print(Boolean.TRUE);

        }
    }
}
