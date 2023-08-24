package com.tiwari.daily_dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Java8Test {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("Java",null,"Pyth","goo",null,"hello","abc"));
        arr.removeIf(Objects::isNull);
        System.out.println(arr);
    }
}
