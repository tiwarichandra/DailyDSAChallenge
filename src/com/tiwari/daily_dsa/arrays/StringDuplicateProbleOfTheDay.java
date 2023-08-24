package com.tiwari.daily_dsa.arrays;

public class StringDuplicateProbleOfTheDay {
    public static void main(String[] args) {

        String s = "aaabbaaccd";

        // aaabbaaccd
        // abbaaccd
        //aaaccd
        // accd
        //aadd

        char[] chars = s.toCharArray();
        char[] chars1 = new char[s.length()];
        for (int i = 0;i<s.length(); i++) {
            for (int j = i+1; j<s.length(); j++) {
                if (i!=j) {
                chars1[i] = chars[i];
                }
            }
        }
    }
}
