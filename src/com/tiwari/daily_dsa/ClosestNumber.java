package com.tiwari.daily_dsa;

public class ClosestNumber {


/*
    Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.



            Example 1:

    Input:
    N = 13 , M = 4
    Output:
            12
    Explanation:
            12 is the Closest Number to
13 which is divisible by 4.
    Example 2:

    Input:
    N = -15 , M = 6
    Output:
            -18
    Explanation:
            -12 and -18 are both similarly close to
-15 and divisible by 6. but -18 has
    the maximum absolute value.
    So, Output is -18


    Your Task:
    You don't need to read input or print anything. Your task is to complete the function closestNumber() which takes an Integer n as input and returns the answer.

 */

    /*
    *
    * closestNumber(n, m)
    Declare q, n1, n2
    q = n / m
    n1 = m * q

    if (n * m) > 0
        n2 = m * (q + 1)
    else
        n2 = m * (q - 1)

    if abs(n-n1) < abs(n-n2)
        return n1
    return n2
    *
    *
    * */

    static int closestNumber(int N , int M) {
       /* int resLeft = 0;
        int resRight = 0;
        if (N % M == 0) {
            return N;
        } else {
            for (int i = 1; i <= Math.abs(N); i++) {
                int left = N - i;
                int right = N + i;
                if (left >= Math.abs(M) && right >= Math.abs(M)) {
                    if (right % M == 0) {
                        resRight = right;
                        return resRight;
                    } else if (left % M == 0) {
                        resLeft = left;
                        return resLeft;
                    }
                }else if(right >= M && right % M == 0){
                    resRight = right;
                    return resRight;
                }else if(left >= M && left % M == 0){
                    resLeft = left;
                    return resLeft;
                }
                else {
                    if(left % M == 0){
                        resLeft = left;
                        return resLeft;
                    }
                    else if(right % M == 0){
                        resRight = right;
                        return resRight;
                    }else if (left % M == 0 && right % M == 0) {
                        resLeft = left;
                        resRight = right;
                        break;
                    }
                }
            }

            if (resLeft < 0 && resRight < 0) {
                return resLeft;
            } else {
                if (resRight > 0)
                    return resRight;
                else
                    return resLeft;
            }
        }*/
        int quotient = N / M;

        int possibleClosestNumber1 = M * quotient;

        int possibleClosestNumber2 = (N * M) > 0 ? (M * (quotient + 1)) : (M * (quotient - 1));

        if (Math.abs (N - possibleClosestNumber1) < Math.abs (N - possibleClosestNumber2)) {
            return possibleClosestNumber1;
        }
        return possibleClosestNumber2;
    }
    public static void main(String[] args) {
        int N  = 13;
        int M = 4;

        System.out.println(closestNumber(N, M));
    }
}
