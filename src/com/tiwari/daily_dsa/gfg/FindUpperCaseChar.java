package com.tiwari.daily_dsa.gfg;

public class FindUpperCaseChar {
    public static void main(String[] args) {
        String s = "ckjkUUYII";

        int count = 0;

        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == Character.toUpperCase(s.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
    }
