package com.tiwari.daily_dsa.arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] arr = {90,100,78,89,67};

        for (int i = 0; i< arr.length; i++) {

            int temp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
