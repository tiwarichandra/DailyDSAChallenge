package com.tiwari.daily_dsa.arrays;

import java.util.Arrays;

public class findIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        int n = 6;
        int key = 5;
        int num = 0;
        int[] temp = new int[n];
        for (int i = 0; i<n; i++) {
          if (key == arr[i]) {
              temp[num] = i;
              num++;
          }
        }

        System.out.println(Arrays.toString(temp));
    }
}
