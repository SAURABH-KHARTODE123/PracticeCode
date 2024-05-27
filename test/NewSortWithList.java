package com.demo.test;
import java.util.ArrayList;
import java.util.Collections;
public class NewSortWithList {
	
	public static void main(String[] args) {
		int  []original= {10,12,13,56,34,67,20,50,33,46,88};

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<original.length-1;i++)
		{
				if(original[i]%2==0)
				{
					list.add(original[i]);
				}
		}
		
		
		//Collections.sort(list);
		
//	for(int i=0;i<list.size()-1;i++)
//		{
//			for(int j=i+1;i<list.size();j++)
//			{
//				if(list.get(i) > list.get(j))
//				{
//					int temp = list.get(i) ;
//			        list.set(i, list.get(j)); 
//                    list.set(j, temp);
//				}
//			}
//		}

        // Sort the list without using Collections.sort
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) { // Use j in the condition
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j)); 
                    list.set(j, temp);
                }
            }
        }

		
		for(int i=0;i<list.size();i++)
		{
 			System.out.println("Sorted Even " + list.get(i));
		}
		
//			System.out.println("Max Even Element " + list.get(list.size() -1));


	}

}

