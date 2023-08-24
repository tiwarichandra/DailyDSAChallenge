package com.tiwari.daily_dsa.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class sortingAlphaNumric {
    public static void main(String[] args) {
        String[] strings = {"ab100", "ab50", "ab2", "ab21", "ab22", "ab3"};

        Arrays.sort(strings, new AlphanumericComparator());

        for (String string : strings) {
            System.out.println(string);
        }
    }

    static class AlphanumericComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            int p1 = 0, p2 = 0;
            while (p1 < o1.length() && p2 < o2.length()) {
                char c1 = o1.charAt(p1), c2 = o2.charAt(p2);
                if (Character.isDigit(c1) && Character.isDigit(c2)) {
                    int q1 = p1 + 1, q2 = p2 + 1;
                    while (q1 < o1.length() && Character.isDigit(o1.charAt(q1))) {
                        q1++;
                    }
                    while (q2 < o2.length() && Character.isDigit(o2.charAt(q2))) {
                        q2++;
                    }
                    int r = Integer.compare(Integer.parseInt(o1.substring(p1, q1)),
                            Integer.parseInt(o2.substring(p2, q2)));
                    if (r != 0) {
                        return r;
                    }
                    p1 = q1;
                    p2 = q2;
                } else {
                    if (c1 != c2) {
                        return c1 - c2;
                    }
                    p1++;
                    p2++;
                }
            }
            return o1.length() - o2.length();
        }
    }
}
