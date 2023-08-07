package com.tiwari.daily_dsa.gfg;


/*
*
* Given a sorted array A of size N. Find number of elements which are less than or equal to given element X.
*
* Input:
* N = 6
* A[] = {1, 2, 4, 5, 8, 10}
* X = 9
* Output:
* 5
*
*
* */
public class FindNumberOfElementLessThanEq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 10};
        int target = 9;
        int temp = 0;
        for (int j : arr) {
            if (j <= target) {
                temp++;
            }
        }

        System.out.println("the count is  : "+temp);
    }
}
