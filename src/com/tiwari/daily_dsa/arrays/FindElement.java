package com.tiwari.daily_dsa.arrays;

public class FindElement {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int n = 5;
        int key = 2;

        int elementAtIndex = findElementAtIndex(a, n, key);
        System.out.println(elementAtIndex);


    }

    private static int findElementAtIndex(int[] a, int n, int key) {
        for (int i = 0; i<n; i++) {
            if (i==key) {
                return a[i];
            }
        }
        return -1;
    }
}
