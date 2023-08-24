package com.tiwari.daily_dsa.arrays;

import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
//        int[] arr = {90,100,78,89,67};
        int[] arr = {56,67,30,79};
        int median = find_median(arr);
        System.out.println(median);
    }

    private static int find_median(int[] arr) {

        Arrays.sort(arr);

        int length = arr.length;
        int i = length / 2;
        if (length%2==1) {
            return arr[i];
        } else {
            int i1 = (arr[i-1] + (arr[i])) / 2;
            return i1;
        }
    }
}
