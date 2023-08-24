package com.tiwari.daily_dsa.arrays;

public class SplitProblem2 {
    public static void main(String[] args) {
        String s = "ABC123XYZ";

//        String[] str = s.split("(?<=\\D)(?=\\d)");
//        System.out.println(str[0]);
//        System.out.println(str[1]);

        char[] ch = s.toCharArray();
        for (int i  = 0; i<s.length()-1; i++) {
            if (ch[i] == ' ') {
                System.out.println("chars "+ch[i]);
            } else {

            }
        }
    }
}
