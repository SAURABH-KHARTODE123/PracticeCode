package com.demo.test;

public class SnippetCode {

//	public static void main(String[] args) {
//		int Integer=10;
//		String a="Sau rabh";
//		//String  []arr= {"a","aa"};
//		for(int i=0;i<=a.length()-1;i++)
//		{
//			System.out.println((i));
//		}
//		// System.out.println(a.length());
//		// System.out.println(a.length());
//
//	}
//
	
	
	public static void main(String[] args) {
		String original="KhartudeKauthadi";
		
		for(char c='a';c<='z';c++)
		{
			int i=0, count=0;
			for(i=0;i<=original.length()-1;i++)
			{
				if(original.charAt(i)==c)
				{
					count++;
				}
			}
			if(count>0)
			{
				
				System.out.println(c+"="+count);
			}
		}
	}
}
