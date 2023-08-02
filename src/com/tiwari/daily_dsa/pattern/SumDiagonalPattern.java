package com.tiwari.daily_dsa.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDiagonalPattern {

            public static void printCombinations(int n) {

        }

        private static List<List<Integer>> generateCombinations(int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            generateCombinationsHelper(targetSum, 1, new ArrayList<>(), result);
            return result;
        }

        private static void generateCombinationsHelper(int targetSum, int currentNum, List<Integer> combination, List<List<Integer>> result) {
            if (targetSum == 0) {
                result.add(new ArrayList<>(combination));
                return;
            }

            for (int i = currentNum; i <= targetSum; i++) {
                combination.add(i);
                generateCombinationsHelper(targetSum - i, i, combination, result);
                combination.remove(combination.size() - 1);
            }
        }

        public static void main(String[] args) {
            int N = 4;
            System.out.println("Combinations for sum " + N + ":");

            List<List<Integer>> combinations = generateCombinations(N);
            combinations.forEach(combination -> {
                combination.forEach(num -> System.out.print(num + " "));
                System.out.println();
            });
        }

}
