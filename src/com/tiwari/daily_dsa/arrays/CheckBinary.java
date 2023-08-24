package com.tiwari.daily_dsa.arrays;

public class CheckBinary {
    public static void main(String[] args) {
        String str = "101";
        boolean binary = isBinary(str);
        System.out.println(binary);
    }

    static boolean isBinary(String str)
    {
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar!=48 && aChar!=49) {
                return false;
            }

        }
        return true;
    }
}
