package com.tiwari.daily_dsa.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicate {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a", "b", "c", "a");
        int[] arr1 = {1,3,5,6};

        System.out.println("first : "+arr.size());
        System.out.println("second : "+arr1.length);

        System.out.println();
        for (int i = 1; i<= arr.size(); i++) {
            for (int j = i+1; j< arr.size(); j++) {
                if (arr.get(i).equalsIgnoreCase(arr.get(j))) {
                    System.out.println(arr.get(i));
                }
            }
        }
    }
}
