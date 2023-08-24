package com.tiwari.daily_dsa.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingScenario {
    public static void main(String[] args) {
        List<String> stringList = List.of("NIFTY 100", "NIFTY 50", "FOO", "NIFTY 75", "Zoo");

        List<String> collect = stringList.stream().sorted(Comparator.comparing(SortingScenario::extractDouble)).collect(Collectors.toList());
        System.out.println(collect);


    }

    static int extractDouble(String s) {
        String num = s.replaceAll("[^\\d.]", "");
        // return 0 if no digits found
        return num.isEmpty() ? 0 : Integer.parseInt(num);
    }
}
