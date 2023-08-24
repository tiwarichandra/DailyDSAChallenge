package com.tiwari.daily_dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class SwitchCaseSolution {
    public static void main(String[] args) {
        List<Double> arr = new ArrayList<>();
//        arr.add(10.0d);
        arr.add(5.0d);
        int choice = 1;
        double ans = switchCase(choice, arr);
        System.out.println(ans);
    }

    private static double switchCase(int choice, List<Double> arr) {

        switch (choice) {

            case 1 :
                return Math.PI * arr.get(0) * arr.get(0);

            case 2 :
                return arr.get(0) * arr.get(1);

            default:
                return 0.0d;
        }

        }
}
