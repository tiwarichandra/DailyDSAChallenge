package com.tiwari.daily_dsa.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfList {
    public static void main(String[] args) {
//        [["Spring"],["Java"],["Python"],["Angular"]]
        List<List<String>> lists = Arrays.asList(Arrays.asList("String"), Arrays.asList("Java"), Arrays.asList("Python"), Arrays.asList("Angular"));
        List<Object> collect = lists.stream().flatMap(Collection::stream).sorted(Comparator.comparing(Object::toString)).collect(Collectors.toList());
    }
}
