package com.tiwari.daily_dsa;

import java.util.Scanner;


/*Given a number N. Your task is to check whether it is fascinating or not.
        Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.
        Example 1:

        Input:
        N = 192
        Output: Fascinating
        Explanation: After multiplication with 2
        and 3, and concatenating with original
        number, number will become 192384576
        which contains all digits from 1 to 9.
        Example 2:

        Input:
        N = 853
        Output: Not Fascinating
        Explanation: It's not a fascinating
        number.*/

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :: " );
        int number = sc.nextInt();
        int numberMultiplyByTwo = number * 2;
        int numberMultiplyByThree = number * 3;

        String numberString = String.valueOf(number).concat(String.valueOf(numberMultiplyByTwo).concat(String.valueOf(numberMultiplyByThree)));

        if(numberString.contains("1") && numberString.contains("2") && numberString.contains("3") && numberString.contains("4") && numberString.contains("5") && numberString.contains("6") && numberString.contains("7") && numberString.contains("8") && numberString.contains("9"))
            System.out.println("Number is Fascinating");
        else
            System.out.println("Number is Not Fascinating");
    }
}
