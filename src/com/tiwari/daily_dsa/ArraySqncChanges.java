package com.tiwari.daily_dsa;

import java.util.Arrays;

/*
* Given an array of distinct integers, shuffle it according to the given order of elements.
For example:
Input:
nums[] = { 1, 2, 3, 4, 5 }
pos[] = { 3, 2, 4, 1, 0 }

Output:

nums[] = { 5, 4, 2, 1, 3 }

i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
In other words, update nums[pos[i]] = nums[i] for every index i.

*
* */


public class ArraySqncChanges {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] pos = { 3, 2, 4, 1, 0 };
        int[] arr = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            arr[pos[i]] = nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
