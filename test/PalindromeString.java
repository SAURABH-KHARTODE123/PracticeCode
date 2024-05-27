package com.demo.test;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String original=sc.nextLine();
		String empty="";
	
		int i=0;
		for(i=original.length()-1;i>=0;i--)
		{
			System.out.println(original.charAt(i));
			empty=empty+original.charAt(i);
			
		}
		if(original.toLowerCase().equals(empty.toLowerCase()))
				{
				System.out.println(original+" is Palindrome String");
				}
		else
		{
			System.out.println(original+" is not  Palindrome String");
		}
		
	}

}
