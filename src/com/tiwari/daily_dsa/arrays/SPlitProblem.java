package com.tiwari.daily_dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPlitProblem {
    public static void main(String[] args) {
     String s = "geeks01for02geeks03!!!";

        System.out.println(splitStringMethod(s));
    }

    private static List<String> splitStringMethod(String S) {
        List<String> list = new ArrayList<>();
        List<String> l = new ArrayList<String>();
        String letters = "", digits = "", symbols = "";

        for(int i=0;i<S.length();i++) {
            if(Character.isDigit(S.charAt(i))) {
                digits+=S.charAt(i);
            }
            else if(Character.isAlphabetic(S.charAt(i))) {
                letters+=S.charAt(i);
            }
            else if(!Character.isSpace(S.charAt(i))) {
                symbols+=S.charAt(i);
            }
        }

        l.add(letters);
        l.add(digits);
        l.add(symbols);
        return l;

    }
}
