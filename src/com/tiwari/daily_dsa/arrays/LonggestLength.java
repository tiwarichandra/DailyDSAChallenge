package com.tiwari.daily_dsa.arrays;

public class LonggestLength {
    public static void main(String[] args) {
        String[] names = { "Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks" };
        String longest = longest(names, 5);
        System.out.println(longest);
    }

    static String longest(String[] names, int n)
    {
        int index = 0;
        int elementLength = names[0].length();
        for(int i=1; i< n; i++) {
            if(names[i].length() > elementLength) {
                index = i; elementLength = names[i].length();
            }
        }
        return names[index];
    }
}
