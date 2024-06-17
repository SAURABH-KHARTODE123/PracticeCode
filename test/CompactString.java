/*
Original: aabbbcc
Compressed: a2b3c2

Enter the String: aabbccc
a2b2c3

*/

package com.demo.test;

import java.util.Scanner;

public class CompactString {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String original=sc.nextLine();
		int count=1;
		for(int i=0;i<original.length()-1;i++)
		{
			if(original.charAt(i)==original.charAt(i+1))
			{
				count++;
			}
			else 
			{
				sb.append(original.charAt(i)).append(count);
				count=1;
			}
		}
		
		sb.append(original.charAt(original.length()-1)).append(count);
		
		
		System.out.println(sb);

	}

}
