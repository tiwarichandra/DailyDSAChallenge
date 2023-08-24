package com.tiwari.daily_dsa.gfg;

public class FindPairSign {
    public static void main(String[] args) {
        String x = "{([])}";

        for (int i = 0; i < x.length(); i++) {
            for (int j = i+1; j < x.length(); j++) {
                if (x.charAt(i) == '{') {
                    if (x.charAt(j) == '}') {
                        continue;
                    }
                }
                if (x.charAt(i) == '[') {
                    if (x.charAt(j) == ']') {
                        continue;
                    }
                }
                if (x.charAt(i) == '(') {
                    if (x.charAt(j) == ')') {
                        continue;
                    }
                }
            }
        }

    }
}
