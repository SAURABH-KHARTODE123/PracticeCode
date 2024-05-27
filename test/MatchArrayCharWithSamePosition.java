package com.demo.test;

import java.util.Arrays;

public class MatchArrayCharWithSamePosition {

	public static void main(String[] args) {
		String a="Saurabh";
		String b="Sa";
	
	//	int maxLength=a.length()+b.length();
		int maxLength=(Math.max(a.length(), b.length()));
		int []newArray= new int[maxLength];

		for(int i=0;i<newArray.length;i++)
		{
			if(i<a.length() &&  i<b.length()  && a.charAt(i)==b.charAt(i))
			{
				newArray[i]=1;
			}
			else
			{
				newArray[i]=0;
			}
		}
		System.out.println(Arrays.toString(newArray));
}
}