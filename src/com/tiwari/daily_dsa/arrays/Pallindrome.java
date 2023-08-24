package com.tiwari.daily_dsa.arrays;

public class Pallindrome {



    public static void main(String[] args) {
        // 121

        int n = 212;
        System.out.println(isPalindrome(n));
    }

    private static Boolean isPalindrome(int n) {
        int reversed = 0;
        int Ogno = n;
        while (Ogno > 0) {
            reversed = reversed * 10;
            reversed =  reversed + Ogno % 10;
            Ogno = Ogno / 10;
        }
        if (reversed != n) {
            return false;
        } else {
            return true;
        }
    }
}
