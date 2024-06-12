package com.demo.test;

public class NonReapeatingCharacter {

    public static void main(String[] args) {
    	String s = "SaurabhKhartode".toLowerCase(); // Convert string to lowercase
        char[] arr = s.toCharArray();

        // Loop through the alphabet to find the frequency of each letter in the string
        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0;
            for (char c : arr) {
                if (c == i) {
                    count++;
                }
            }
            if (count > 0) { // Print only if the character is present in the string
                System.out.println(i + "=" + count);
            }
        } 
       		
    }
}
