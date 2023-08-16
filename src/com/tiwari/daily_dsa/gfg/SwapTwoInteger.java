package com.tiwari.daily_dsa.gfg;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoInteger {

    static List<Integer> get(int a, int b)
    {
        List<Integer> integers = new ArrayList<>();
        a = a+b;
        b = a-b;
        a = a-b;

        integers.add(a);
        integers.add(b);

        return integers;
    }
    public static void main(String[] args) {

        get(15, 8);
    }
}
