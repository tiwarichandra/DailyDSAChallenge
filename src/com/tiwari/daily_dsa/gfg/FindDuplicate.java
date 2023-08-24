package com.tiwari.daily_dsa.gfg;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};


//        new ArrayList<>(List.of(arr)).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(longEntry -> longEntry.getValue() > 1)
////                .forEach(longEntry -> System.out.println(Arrays.toString(longEntry.getKey())));
//                .forEach((integer, aLong) -> System.out.println(integer + " : " + aLong));

        List<Integer> resultList = new ArrayList<>();
        for (int i : arr)
            resultList.add(i);

        List<Integer> collect = resultList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(longEntry -> longEntry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(collect);
//                .reduce((characterIntegerEntry, characterIntegerEntry2) -> characterIntegerEntry2);

//        .filter(characterIntegerEntry -> characterIntegerEntry.getValue() == 1)
//                .reduce((characterIntegerEntry, characterIntegerEntry2) -> characterIntegerEntry2)
//                .get().getKey();


//        collect
//                .entrySet().stream().filter(longEntry -> longEntry.getValue() > 1)
//                .forEach(longEntry -> System.out.println(Arrays.toString(longEntry.getKey())));
    }
}
