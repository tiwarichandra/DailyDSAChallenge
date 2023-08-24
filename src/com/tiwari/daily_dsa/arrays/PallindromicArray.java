package com.tiwari.daily_dsa.arrays;

public class PallindromicArray {
    public static int palinArray(int[] a, int n) {
//        int rev;
        for (int i = 0; i<n; i++) {
            int rev = 0;
            int temp = a[i];

            while (temp > 0) {
                rev = rev *10;
                rev = rev + temp % 10;
                temp = temp/10;
            }
            if (rev != a[i]) {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        int n = 5;




        int i = palinArray(arr, n);
        System.out.println(i);
    }
}
