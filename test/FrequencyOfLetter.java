package com.demo.test;

//public class FrequencyOfLetter {
//
//	public static void main(String[] args) {
//		String original= "shubhamaa";
//		String str = " ";
//		
//		for(int i=0;i<original.length()-1;i++)
//		{
//			for(int j=i+1;j<original.length()-1;j++)
//			{
//				if(original.charAt(i) == original.charAt(j))
//				{
//                       str = str + original.charAt(i);
//				 }
//			}
//		}
//		System.out.println(str);
//		
//	}
//
//}


public class FrequencyOfLetter {

	public static void main(String[] args) {
		String original= "ShubBhamaa123445";
		String str = " ";
		char c;
		for(int i=0;i<original.length();i++)
		{
			c=original.charAt(i);
				if(Character.isUpperCase(c) || Character.isDigit(c))
					
					str=str + c;
	    }
			
		System.out.println("Uppercase and Digits = " + str);
	}
}

