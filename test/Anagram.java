package com.demo.test;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String a = "listent";
        String b = "silent";

        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        // Sort the arrays
        Arrays.sort(a1);
        Arrays.sort(b1);

        // Initialize result as true
        boolean result = true;

        // Compare sorted arrays
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != b1[i]) {
                result = false;
                break;
            }
        }

        // Print result
        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
