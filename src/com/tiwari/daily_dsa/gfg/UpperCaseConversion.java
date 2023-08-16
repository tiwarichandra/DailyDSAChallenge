package com.tiwari.daily_dsa.gfg;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class UpperCaseConversion {
    public static void main(String[] args) {
        String str = "i love programming";
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();
        Arrays.stream(split).map(s -> s.substring(0, 1).toUpperCase()
                .concat(s.substring(1).toLowerCase())).forEach(concat -> {
           sb.append(concat).append("");
        });

    }
}
