package com.tiwari.daily_dsa;

public class SortWelcome {
    public static void main(String[] args) {
        String str = "welcome";


        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                char temp;
                if (str.charAt(i) > str.charAt(j)) {
                    char c = str.charAt(i);
                    temp = str.charAt(i);
//                    str.charAt(i) = str.charAt(j);
//                    str.charAt(j) = temp;
                }

            }

        }
    }
}
