package com.tiwari.daily_dsa.gfg;


/*
* Given N,  reverse the digits of N.
*
* You don't need to read or print anything. Your task is to complete the function reverse_digit() which takes N as input parameter and returns the reversed number
*
* Input: 200
    Output: 2
    Explanation: By reversing the digits of
    number, number will change into 2
    *
    *
    * Input : 122
    Output: 221
    Explanation: By reversing the digits of
    number, number will change into 221.
*
* */
public class ReverseDigits {
    public static void main(String[] args) {

        int n = 221;

        int rev_num = 0;
        while(n!=0)
        {
            rev_num = rev_num * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev_num);



    }
}
