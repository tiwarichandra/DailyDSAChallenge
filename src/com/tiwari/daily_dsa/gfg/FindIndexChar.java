package com.tiwari.daily_dsa.gfg;

import java.text.DecimalFormat;

public class FindIndexChar {
    public static void main(String[] args) {
//        String str = "cdbkdub";
//
//        String substring = str.substring(0, 6);
//
//        System.out.println(substring);
        final DecimalFormat decfor = new DecimalFormat("0.00");

        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        Float sum = 0.0f;
        for (int i = 0; i<n; i++) {
            sum += arr[i];
        }
        Float f = sum /n;




        System.out.println(String.valueOf(decfor.format(f)));


    }
}
