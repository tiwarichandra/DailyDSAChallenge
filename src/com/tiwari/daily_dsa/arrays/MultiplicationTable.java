package com.tiwari.daily_dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 9;

        ArrayList<Integer> table = getTable(n);

        System.out.println(table);

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.next();
        sc.nextFloat();
    }

    private static ArrayList<Integer> getTable(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        int t = 1;
        for (int i = 1; i <= 10; i++) {
            t = n*i;
            list.add(t);
        }
        return list;
    }
}
