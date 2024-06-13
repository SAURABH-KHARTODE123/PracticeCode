package com.demo.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubString {

	public static void main(String[] args) {
		String s="abcdabcbb";
		lengthOfLongestSubstring(s);
		

	}

	private static void lengthOfLongestSubstring(String s) {
		{
		String subString =null;
		int  lengthOfSubString=0;
		char [] arr=s.toCharArray();
		//System.out.println(Arrays.toString(arr));
		Map <Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		for (int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
				map.clear();
				
			}
			if(map.size()>lengthOfSubString)
			{
				lengthOfSubString=map.size();
				subString=map.keySet().toString();
			}
			
		}
		System.out.println("Max length of SubString is:"+lengthOfSubString);
		System.out.println("Max Sub String is:"+subString);
		}
	}
}
