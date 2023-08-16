package com.tiwari.daily_dsa.gfg;

public class PatternGFGDiagonal {
    public static void main(String[] args) {
        /*int n = 4;
        int temp = 1;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<i+1; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }*/

        int n = 3;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
