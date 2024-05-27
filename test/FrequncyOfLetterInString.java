//package com.test;
//
//public class FrequncyOfLetterInString {
//
//	public static void main(String[] args) {
//		String original="SaurabhKhartude";
//		String empty="";
//		int i=0,j=0,count=0;
//		
//		for(i=0;i<=original.length()-1;i++)
//		{
//			for (j=i+1;i<=original.length();i++)
//			{
//				if(original.charAt(i)== original.charAt(j))
//				{
//					empty=empty + original.charAt(j);
//					count++;
//				}
//				
//			}
//			
//		}		System.out.println(original.charAt(j)+"="+count);
//
//	}
//package com.test;
//
//public class FrequncyOfLetterInString {
//
//	public static void main(String[] args) {
//		String original = "SaurabhKhartude";
//		String empty = "";
//		
//		for (int i = 0; i < original.length(); i++) {
//			int count = 1; // Initialize count for each character
//			for (int j = i + 1; j < original.length(); j++) {
//				if (original.charAt(i) == original.charAt(j)) {
//					count++;
//				}
//			}
//			// Avoid duplicate counting
//			if (!empty.contains(String.valueOf(original.charAt(i)))) {
//				System.out.println(original.charAt(i) + "=" + count);
//				empty += original.charAt(i); // Store the counted character
//			}
//		}
//	}
//}
//
////}
package com.demo.test;

public class FrequncyOfLetterInString {

    public static void main(String[] args) {
        String original = "saurabh";

        // Iterate through each character in the string
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            // Count the occurrences of the current character
            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) == c) {
                    count++;
                }
            }
            // Print the character and its frequency if it occurs at least once
            if (count > 0) {
                System.out.println(c + "=" + count);
            }
        }
    }
}

