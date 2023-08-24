package com.tiwari.daily_dsa.arrays;

public class Array1InsertElement {
    int count;
    public static void main(String[] args) {

        Array1InsertElement array1InsertElement = new Array1InsertElement();
        int[] a = new int[5];


//        a[0] = 12;
//        a[1] = 34;
//        a[2] = 15;
//        a[3] = 67;
//        a[4] = 48;
//        a[5] = 48;

        for (int j = 0; j< a.length; j++) {
//            a[j] = j;
            array1InsertElement.insert(a, j);
        }

        for (int i = 0; i< a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private void insert(int[] a, int val) {
        a[count++] = val;
    }
}
