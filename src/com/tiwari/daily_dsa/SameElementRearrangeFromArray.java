package com.tiwari.daily_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SameElementRearrangeFromArray {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 5, 5, 3, 1, 2, 2, 4, 3 };
//        int[] arr = { 1, 2, 3, 1, 2, 1 };
        int length = arr.length;
        for (int i = 0; i<length; i++) {
            int temp = 0;
            for (int j = i+1; j< length; j++) {
                if (arr[i] == arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//        List<String> arr1 = new ArrayList<>(Arrays.asList("java","ruby","python","angular","java","HTML","angular"));

//        arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .forEach((s, aLong) -> System.out.println(s+","+aLong));

    }
}
