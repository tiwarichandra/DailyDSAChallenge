package com.tiwari.daily_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindArrayPair {

    public static void main(String[] args) {
        int[] arr =  {1, 2, 3};

        int type =2;

        for (int i = 0; i< arr.length; i++) {

            for (int k = 0; k< type; k++) {

                System.out.print("{"+arr[i]+","+arr[k]+"}");
            }
            System.out.println();
        }
    }
}
