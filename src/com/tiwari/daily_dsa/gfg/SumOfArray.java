package com.tiwari.daily_dsa.gfg;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        float sum = 0;
        int temp = 1;
        int length = arr.length;
        float[] newArr = new float[length];
        for (int i = 0; i< length; i++) {
            sum += arr[i];
            newArr[i] = sum/temp;
            temp++;
        }

        System.out.print(Arrays.toString(newArr));
    }
}
